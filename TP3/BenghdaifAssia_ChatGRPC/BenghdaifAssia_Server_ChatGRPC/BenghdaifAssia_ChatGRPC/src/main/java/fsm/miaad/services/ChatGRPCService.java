package fsm.miaad.services;

import fsm.miaad.stubs.Chat;
import fsm.miaad.stubs.ChatServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class ChatGRPCService extends ChatServiceGrpc.ChatServiceImplBase {


    final static Scanner scan=new Scanner(System.in);
    @Override
    public StreamObserver<Chat.ChatCurrencyRequest> chatBiDirectionalStreaming(StreamObserver<Chat.ChatCurrencyResponse> responseObserver) {
        return new StreamObserver<Chat.ChatCurrencyRequest>() {
            @Override
            public void onNext(Chat.ChatCurrencyRequest chatCurrencyRequest) {
                System.out.println("This is The Message==>"+chatCurrencyRequest.getMessageSend()+";;From==>"+chatCurrencyRequest.getCurrencyFrom()+";;To==>"+chatCurrencyRequest.getCurrencyTo()+" and this is my responce==>");
                String myresponse=scan.nextLine();
                Chat.ChatCurrencyResponse response=Chat.ChatCurrencyResponse.newBuilder()
                                .setMessageResponse("This is The Message==>"+chatCurrencyRequest.getMessageSend()+";;From==>"+chatCurrencyRequest.getCurrencyTo()+";;To==>"+chatCurrencyRequest.getCurrencyFrom()+" and this is my responce==>"+myresponse)
                        .build();
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
    public void chatUnary(Chat.ChatCurrencyRequest request, StreamObserver<Chat.ChatCurrencyResponse> responseObserver) {
        String currancyFrom=request.getCurrencyFrom();
        String currancyTo=request.getCurrencyTo();
        System.out.println("This is The Message==>"+request.getMessageSend()+";;From==>"+currancyFrom+";;To==>"+currancyTo+" and this is my responce==>");

        String myresponse=scan.nextLine();
        Chat.ChatCurrencyResponse response= Chat.ChatCurrencyResponse.newBuilder()
                .setCurrencyFrom(currancyTo)
                .setCurrencyTo(currancyFrom)
                .setMessageResponse(myresponse)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Chat.ChatCurrencyRequest> chatClientStreaming(StreamObserver<Chat.ChatCurrencyResponse> responseObserver) {
        return new StreamObserver<Chat.ChatCurrencyRequest>() {

            String myresponse="",from="",to="";
            @Override
            public void onNext(Chat.ChatCurrencyRequest chatCurrencyRequest) {
                to=chatCurrencyRequest.getCurrencyTo();
                from=chatCurrencyRequest.getCurrencyFrom();
                System.out.println("This is The Message==>"+chatCurrencyRequest.getMessageSend()+";;From==>"+chatCurrencyRequest.getCurrencyFrom()+";;To==>"+chatCurrencyRequest.getCurrencyTo()+" and this is my responce==>");

                myresponse=scan.nextLine();

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Chat.ChatCurrencyResponse response=Chat.ChatCurrencyResponse.newBuilder()
                        .setCurrencyFrom("me server")
                        .setCurrencyTo(from)
                        .setMessageResponse("my response==>"+myresponse)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }


    @Override
    public void chatServerSreaming(Chat.ChatCurrencyRequest chatCurrencyRequest, StreamObserver<Chat.ChatCurrencyResponse> responseObserver) {

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int count=0;
            @Override
            public void run() {
                System.out.println("This is The Message==>"+chatCurrencyRequest.getMessageSend()+";;From==>"+chatCurrencyRequest.getCurrencyFrom()+";;To==>"+chatCurrencyRequest.getCurrencyTo()+" and this is my responce==>");

                String myresponse=scan.nextLine();
                Chat.ChatCurrencyResponse response=Chat.ChatCurrencyResponse.newBuilder()
                        .setCurrencyFrom("me server")
                        .setCurrencyTo(chatCurrencyRequest.getCurrencyFrom())
                        .setMessageResponse("my response==>"+myresponse)
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
}
