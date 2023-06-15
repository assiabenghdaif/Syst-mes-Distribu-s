package fsm.miaad.clients;


import fsm.miaad.models.Radar;
import fsm.miaad.models.Vehicle;
import fsm.miaad.stubs.Radargrpc;
import fsm.miaad.stubs.SpeedingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.*;

public class RadarGRPCClient {


    public static void main(String[] args) {
        Timer timer=new Timer();
        List<Radar> radars=new ArrayList<>();
        List<Vehicle> vehicles=new ArrayList<>();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 2220)
                .usePlaintext()
                .build();

        SpeedingServiceGrpc.SpeedingServiceStub newStub=SpeedingServiceGrpc.newStub(channel);

        StreamObserver<Radargrpc.Empty> emptyStreamObserver=newStub.getRadarIDExist(new StreamObserver<Radargrpc.Radars>() {
            @Override
            public void onNext(Radargrpc.Radars value) {
                Radargrpc.Radars radarsList=value;
                System.out.println("radarsList.getRadarCount() "+radarsList.getRadarCount());
                for (int i=0;i<radarsList.getRadarCount();i++){
                    radars.add(new Radar(value.getRadar(i).getRadarId(),value.getRadar(i).getMaxSpeed()));
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {

//            }
//        }, 15000, 1000);


        StreamObserver<Radargrpc.Empty> emptyStreamObserver2=newStub.getVehicleIDExist(new StreamObserver<Radargrpc.Vehicles>() {
            @Override
            public void onNext(Radargrpc.Vehicles value) {
                Radargrpc.Vehicles vehicles1=value;
                System.out.println("vehicles1.getVehicleCount() "+vehicles1.getVehicleCount());
                for (int i=0;i<vehicles1.getVehicleCount();i++){
                    vehicles.add(new Vehicle(value.getVehicle(i).getVehicleId()));
                }
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {

//            }
//        }, 15000, 1000);
        Radargrpc.Empty empty=Radargrpc.Empty.newBuilder().build();
        emptyStreamObserver.onNext(empty);
        Radargrpc.Empty empty2=Radargrpc.Empty.newBuilder().build();
        emptyStreamObserver2.onNext(empty2);


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

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Radargrpc.Empty empty=Radargrpc.Empty.newBuilder().build();
                emptyStreamObserver.onNext(empty);
                Radargrpc.Empty empty2=Radargrpc.Empty.newBuilder().build();
                emptyStreamObserver2.onNext(empty2);
                Random random = new Random();


                int listSizeVehicle = vehicles.size();
//                System.out.println("listSizeVehicle "+listSizeVehicle);
                int randomIndexVehicle = random.nextInt(listSizeVehicle);
                Long vehicleId=vehicles.get(randomIndexVehicle).getId();

                int listSizeRadar = radars.size();
                int randomIndexRadar = random.nextInt(listSizeRadar);
                Long radarId=radars.get(randomIndexRadar).getId();
                double maxSpeed=radars.get(randomIndexRadar).getMaxSpeed();
                double speed=Math.abs(1 + random.nextDouble() * 299);
                if(maxSpeed<speed)  speed=Math.abs(1 + random.nextDouble() * 299)+maxSpeed;
                else speed=speed;
                Radargrpc.Request request=Radargrpc.Request.newBuilder()
                        .setMaxSpeed(maxSpeed)
                        .setSpeed(speed)
                        .setRadarId(radarId)
                        .setVehicleId(vehicleId)
                        .build();
                streamObserver.onNext(request);
            }
        }, 15000, 1000); //2 min //2 * 60 * 1000
    }
}