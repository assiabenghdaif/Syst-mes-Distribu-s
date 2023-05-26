package fsm.miaad.server;

import fsm.miaad.services.GameGRPCService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.Random;

public class gameGRPCServer {

    public static void main(String[] args) {
        Server server= ServerBuilder.forPort(2001).addService(new GameGRPCService()).build();
        try {
//            GameGRPCService.number_win= new Random().nextInt(1000) + 1;
            server.start();
            server.awaitTermination();

//            System.out.println("================================================\nServer lanced");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("================================================\nServer lanced");



    }
}
