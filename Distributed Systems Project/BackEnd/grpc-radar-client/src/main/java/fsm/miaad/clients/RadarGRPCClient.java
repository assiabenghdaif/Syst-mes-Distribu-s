package fsm.miaad.clients;


import fsm.miaad.stubs.Radargrpc;
import fsm.miaad.stubs.SpeedingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RadarGRPCClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2220)
                .usePlaintext()
                .build();

        SpeedingServiceGrpc.SpeedingServiceStub newStub=SpeedingServiceGrpc.newStub(channel);

        StreamObserver<Radargrpc.Request> streamObserver= newStub.speedingRandomly(new StreamObserver<Radargrpc.Response>() {
            @Override
            public void onNext(Radargrpc.Response response) {
                System.out.println("=============");
                System.out.println(response);
                System.out.println("============");
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Random random = new Random();
                double speed=Math.abs(1 + random.nextDouble() * 299);
                double maxSpeed=speed-(speed*10/100);
                Radargrpc.Request request=Radargrpc.Request.newBuilder()
                        .setMaxSpeed(maxSpeed)
                        .setSpeed(speed)
                        .setRadarId(4)
                        .setVehicleId(3)
                        .build();
                streamObserver.onNext(request);
            }
        }, 15000, 1000); //2 min //2 * 60 * 1000
    }
}