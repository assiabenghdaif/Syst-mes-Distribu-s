package fsm.miaad.services;

import fsm.miaad.stubs.Bank;
import fsm.miaad.stubs.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Timer;
import java.util.TimerTask;


public class BankGRPCService extends BankServiceGrpc.BankServiceImplBase {

    static final double madTOdollar=0.1;
    @Override
    public void convertUnary(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
//        super.convertUnary(request, responseObserver);
        String currancyFrom=request.getCurrencyFrom();
        String currancyTo=request.getCurrencyTo();
        double amount=request.getAmount();
        Bank.ConvertCurrencyResponse response= Bank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currancyFrom)
                .setCurrencyTo(currancyTo)
                .setAmount(amount)
                .setResult(amount*madTOdollar)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void convertServerSreaming(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        double amount=request.getAmount();
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int count=0;
            @Override
            public void run() {
                Bank.ConvertCurrencyResponse response=Bank.ConvertCurrencyResponse.newBuilder().setResult(request.getAmount()*madTOdollar)
                        .build();
                responseObserver.onNext(response);
                count++;
                if(count==10){
                    responseObserver.onCompleted();
                    timer.cancel();
                }

            }
        },1000,1000);
    }

    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> convertBiDirectionalStreaming(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Bank.ConvertCurrencyRequest>() {
            @Override
            public void onNext(Bank.ConvertCurrencyRequest convertCurrencyRequest) {
                Bank.ConvertCurrencyResponse response=Bank.ConvertCurrencyResponse.newBuilder().
                        setResult(convertCurrencyRequest.getAmount()*madTOdollar).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }

    @Override
    public StreamObserver<Bank.ConvertCurrencyRequest> convertClientStreaming(StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Bank.ConvertCurrencyRequest>() {
            double sum=0;
            @Override
            public void onNext(Bank.ConvertCurrencyRequest convertCurrencyRequest) {
                sum+=convertCurrencyRequest.getAmount();
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Bank.ConvertCurrencyResponse response=Bank.ConvertCurrencyResponse.newBuilder()
                        .setResult(sum*madTOdollar)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
