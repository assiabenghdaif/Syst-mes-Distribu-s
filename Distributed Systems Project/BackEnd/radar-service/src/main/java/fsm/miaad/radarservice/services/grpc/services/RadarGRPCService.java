package fsm.miaad.radarservice.services.grpc.services;

import fsm.miaad.radarservice.entities.Radar;
import fsm.miaad.radarservice.models.Infraction;
import fsm.miaad.radarservice.models.Vehicle;
import fsm.miaad.radarservice.repositories.RadarRepository;
import fsm.miaad.radarservice.services.feign.ImmatriculationRestClient;
import fsm.miaad.radarservice.services.feign.InfractionRestClient;
import fsm.miaad.radarservice.services.grpc.stubs.Radargrpc;
import fsm.miaad.radarservice.services.grpc.stubs.SpeedingServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@GrpcService
public class RadarGRPCService extends SpeedingServiceGrpc.SpeedingServiceImplBase {
    private RadarRepository radarRepository;
    private InfractionRestClient infractionRestClient;
    private ImmatriculationRestClient immatriculationRestClient;

    public RadarGRPCService(RadarRepository radarRepository, InfractionRestClient infractionRestClient, ImmatriculationRestClient immatriculationRestClient) {
        this.radarRepository = radarRepository;
        this.infractionRestClient = infractionRestClient;
        this.immatriculationRestClient = immatriculationRestClient;
    }

    private static final double MIN_LATITUDE = -90.0;
    private static final double MAX_LATITUDE = 90.0;
    private static final double MIN_LONGITUDE = -180.0;
    private static final double MAX_LONGITUDE = 180.0;
    Random random=new Random();


    @Override
    public StreamObserver<Radargrpc.Request> speedingRandomly(StreamObserver<Radargrpc.Response> responseObserver) {
        return new StreamObserver<Radargrpc.Request>() {
            @Override
            public void onNext(Radargrpc.Request request) {
                double speed=request.getSpeed();
                double maxSpeed=request.getMaxSpeed();
                Long radarId=request.getRadarId();
                Long vehicleId=request.getVehicleId();


                double latitude = generateLatitude();
                double longitude = generateLongitude();
                Radar radar1=radarRepository.findById(radarId).orElse(null);
                if(radar1==null){
                    Radar radar=new Radar(radarId,maxSpeed,longitude,latitude,null);
                    radar=radarRepository.save(radar);
                }
                Vehicle vehicle=immatriculationRestClient.VehicleById(vehicleId);
                //  Infraction(Long id, Date date, Long radarId, String vehicleLicensePlate, double vehicleSpeed, double maxSpeed, double amount, ...)   Infraction()
                Infraction infraction=new Infraction(null,new Date(),radarId,vehicle.getLicensePlate(),speed,maxSpeed,500+(speed-maxSpeed)*10,vehicle);
                infraction=infractionRestClient.addInfraction(infraction);
//                List<Infraction> infractions=new ArrayList<>();
//                infractions.add(infraction);
//                radar.setInfractions(infractions);
//                radarRepository.save(radar);
                Radargrpc.Response response=Radargrpc.Response.newBuilder()
                        .setSpeed(speed)
                        .setMaxSpeed(maxSpeed)
//                        .setOwnerfirstname(vehicle.getOwner().getFirstname())
//                        .setOwnerlastname(vehicle.getOwner().getLastname())
                        .setVehiclelicensePlate(vehicle.getLicensePlate())
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }


    @Override
    public StreamObserver<Radargrpc.Empty> getRadarIDExist(StreamObserver<Radargrpc.Radars> responseObserver) {
        return new StreamObserver<Radargrpc.Empty>() {


            @Override
            public void onNext(Radargrpc.Empty value) {
                List<Radar> radarList=new ArrayList<>();
                List<Radar> radars=radarRepository.findAll();

                Radargrpc.Radars.Builder builder=Radargrpc.Radars.newBuilder();
                for (Radar radar:radars){
                    Radargrpc.Radar radarresponse=Radargrpc.Radar.newBuilder()
                            .setRadarId(radar.getId())
                            .setMaxSpeed(radar.getMaxSpeed())
                            .build();
                    builder.addRadar(radarresponse);
                }
                responseObserver.onNext(builder.build());

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Radargrpc.Empty> getVehicleIDExist(StreamObserver<Radargrpc.Vehicles> responseObserver) {
        return new StreamObserver<Radargrpc.Empty>() {
            @Override
            public void onNext(Radargrpc.Empty value) {
                List<Vehicle> vehicleList=new ArrayList<>();
                List<Vehicle> vehicles=immatriculationRestClient.allVehicles();

                Radargrpc.Vehicles.Builder builder=Radargrpc.Vehicles.newBuilder();
                for (Vehicle vehicle:vehicles){
                    Radargrpc.Vehicle vehicleresponse=Radargrpc.Vehicle.newBuilder()
                            .setVehicleId(vehicle.getId())
                            .build();
                    builder.addVehicle(vehicleresponse);
                }
                responseObserver.onNext(builder.build());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    private static double generateLatitude() {
        Random random = new Random();
        return MIN_LATITUDE + (random.nextDouble() * (MAX_LATITUDE - MIN_LATITUDE));
    }

    private static double generateLongitude() {
        Random random = new Random();
        return MIN_LONGITUDE + (random.nextDouble() * (MAX_LONGITUDE - MIN_LONGITUDE));
    }
}

//
//Les infractions de première classe : 700 dh ;
//Les infractions de deuxième classe : 500 dh ;
//Les infractions de troisième classe : 300 dh.
