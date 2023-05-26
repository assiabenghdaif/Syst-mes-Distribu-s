package fsm.miaad.server;

import fsm.miaad.services.BankGRPCService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    public static void main(String[] args) {
        Server server= ServerBuilder.forPort(2001).addService(new BankGRPCService()).build();
        try {
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
