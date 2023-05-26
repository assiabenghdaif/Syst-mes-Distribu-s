package fsm.miaad.clients;


import fsm.miaad.stubs.Chat;
import fsm.miaad.stubs.ChatServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class GRPCClient1 {

    final static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",2001)
                .usePlaintext()
                .build();



        /** BiDire**/

        ChatServiceGrpc.ChatServiceStub newStub=ChatServiceGrpc.newStub(managedChannel);


        StreamObserver<Chat.ChatCurrencyRequest> streamObserver = newStub.chatBiDirectionalStreaming(new StreamObserver<Chat.ChatCurrencyResponse>() {
            @Override
            public void onNext(Chat.ChatCurrencyResponse response) {
                System.out.println("=============");
                System.out.println(response);
                System.out.println("============");
            }
            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("FIN");
            }
        });

        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int counter=0;
            @Override
            public void run() {
                System.out.println("From==>");
                String from=scan.nextLine();
                System.out.println("To==>");
                String to=scan.nextLine();
                System.out.println("Message to send==>");
                String message=scan.nextLine();
                Chat.ChatCurrencyRequest request=Chat.ChatCurrencyRequest.newBuilder()
                        .setCurrencyFrom(from)
                        .setCurrencyTo(to)
                        .setMessageSend(message)
                        .build();

                streamObserver.onNext(request);
                ++counter;
                System.out.println("Counter = "+counter);
                if(counter==10){
                    streamObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 9000, 1000);

        System.in.read();
    }
}