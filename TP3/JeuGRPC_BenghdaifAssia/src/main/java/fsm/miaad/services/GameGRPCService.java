package fsm.miaad.services;

import fsm.miaad.stubs.Game;
import fsm.miaad.stubs.GameServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;


public class GameGRPCService extends GameServiceGrpc.GameServiceImplBase {
    public static int number_win;// = new Random().nextInt(1000) + 1;
    public Vector<StreamObserver<Game.GameCurrencyResponse>> users=new Vector<>();

    public GameGRPCService(){
        number_win=new Random().nextInt(1000) + 1;
        System.out.println("===============the secret number is "+number_win);
    }

    @Override
    public StreamObserver<Game.GameCurrencyRequest> gameBiDirectionalStreaming(StreamObserver<Game.GameCurrencyResponse> responseObserver) {
        return new StreamObserver<Game.GameCurrencyRequest>() {
//            Random random = new Random();

            // generate a random integer between 1 and 1000

            @Override
            public void onNext(Game.GameCurrencyRequest gameCurrencyRequest) {
                boolean exist=false;
                int number_send=gameCurrencyRequest.getNumber();
                int userid=gameCurrencyRequest.getUserid();
                for (StreamObserver<Game.GameCurrencyResponse> client : users) {
                    if (client == responseObserver) {
                        exist=true;
                        break;
//                        client.onNext(Chat.ChatMessage.newBuilder().setSenderName(senderName).setMessage(messageContent).build());
                    }
                }
                if(exist==false){
                    users.add(responseObserver);

                }
                String result="";
                if(number_send==number_win) {
                    result = "BRAVO vous avez gagné";
                    Game.GameCurrencyResponse response=Game.GameCurrencyResponse.newBuilder()
                            .setResponse(result)
                            .build();
                    responseObserver.onNext(response);

                    broadcastWinner(userid+" hhhh",responseObserver);

                    responseObserver.onCompleted();
                }
                else if (number_send<number_win) {
                    result = "Votre nombre est plus petit";
                    Game.GameCurrencyResponse response=Game.GameCurrencyResponse.newBuilder()
                            .setResponse(result)
                            .build();
                    responseObserver.onNext(response);
                }
                else {
                    result = "Votre nombre est plus grand";
                    Game.GameCurrencyResponse response=Game.GameCurrencyResponse.newBuilder()
                            .setResponse(result)
                            .build();
                    responseObserver.onNext(response);
                }


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



//    @Override
//    public void broadCastwinnerServerSreaming(Game.GameCurrencyRequest request, StreamObserver<Game.GameCurrencyResponse> responseObserver) {
//        users.add(responseObserver);
//    }

    private void broadcastWinner(String winner, StreamObserver<Game.GameCurrencyResponse> observer) {

        users.remove(observer);
        for (StreamObserver<Game.GameCurrencyResponse> client : users) {
            Game.GameCurrencyResponse winneResponse = Game.GameCurrencyResponse.newBuilder()
                    .setResponse("Game over, the winner is " + winner)
                    .build();
            client.onNext(winneResponse);
            client.onCompleted();
        }
    }

}

