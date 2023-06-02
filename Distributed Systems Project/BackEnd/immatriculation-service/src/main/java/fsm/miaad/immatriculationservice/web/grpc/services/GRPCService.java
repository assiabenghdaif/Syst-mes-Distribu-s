package fsm.miaad.immatriculationservice.web.grpc.services;

import fsm.miaad.immatriculationservice.entities.Owner;
import fsm.miaad.immatriculationservice.entities.Vehicle;
import fsm.miaad.immatriculationservice.repositories.OwnerRepository;
import fsm.miaad.immatriculationservice.repositories.VehicleRepository;
import fsm.miaad.immatriculationservice.web.grpc.stubs.Immatriculation;
import fsm.miaad.immatriculationservice.web.grpc.stubs.ImmatriculationServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@GrpcService
@AllArgsConstructor
public class GRPCService extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase {



    private OwnerRepository ownerRepository;
    private VehicleRepository vehicleRepository;
    @Override
    public void allOwners(Immatriculation.Empty request, StreamObserver<Immatriculation.OwnerList> responseObserver) {
        List<Owner> owners=ownerRepository.findAll();
        Immatriculation.OwnerList.Builder ownerListResponse= Immatriculation.OwnerList.newBuilder();
        for (Owner owner:owners) {

            Immatriculation.VehiculeList.Builder builder=Immatriculation.VehiculeList.newBuilder();
            for (Vehicle vehicle:owner.getVehicles()){
                Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                        .setLicensePlate(vehicle.getLicensePlate())
                        .setId(Math.toIntExact(vehicle.getId()))
                        .setModel(vehicle.getModel())
                        .setFiscalPower(vehicle.getFiscalPower())
                        .setBrand(vehicle.getBrand())
                        .build();
                builder.addVehicules(vehiculeresponse);
            }
                Immatriculation.Owner response=Immatriculation.Owner.newBuilder()
                        .setId(Math.toIntExact(owner.getId()))
                        .setEmail(owner.getEmail())
                        .setBirthDate(owner.getBirthDate()+"")
                        .setFirstname(owner.getFirstname())
                        .setLastname(owner.getLastname())
                        .setVehicules(builder)
                        .build();
//            }
            ownerListResponse.addOwners(response);

        }
        responseObserver.onNext(ownerListResponse.build());
        responseObserver.onCompleted();
    }

    @Override
    public void allVehicules(Immatriculation.Empty request, StreamObserver<Immatriculation.VehiculeList> responseObserver) {
        List<Vehicle> vehicles=vehicleRepository.findAll();
        Immatriculation.VehiculeList.Builder builder=Immatriculation.VehiculeList.newBuilder();
        for (Vehicle vehicle:vehicles){
            Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                    .setLicensePlate(vehicle.getLicensePlate())
                    .setId(Math.toIntExact(vehicle.getId()))
                    .setModel(vehicle.getModel())
                    .setFiscalPower(vehicle.getFiscalPower())
                    .setBrand(vehicle.getBrand())
                    .build();
            builder.addVehicules(vehiculeresponse);
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void editOwner(Immatriculation.Owner request, StreamObserver<Immatriculation.Owner> responseObserver) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Long id= Long.valueOf(request.getId());
        Owner owner1=ownerRepository.findById(id).orElse(null);
        if(owner1!=null){
            if(request.getFirstname()!=null) owner1.setFirstname(request.getFirstname());
            if(request.getEmail()!=null) owner1.setEmail(request.getEmail());
            if(request.getLastname()!=null) owner1.setLastname(request.getLastname());

            Owner owner=ownerRepository.save(owner1);


            Immatriculation.VehiculeList.Builder builder=Immatriculation.VehiculeList.newBuilder();
            for (Vehicle vehicle:owner.getVehicles()){
                Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                        .setLicensePlate(vehicle.getLicensePlate())
                        .setId(Math.toIntExact(vehicle.getId()))
                        .setModel(vehicle.getModel())
                        .setFiscalPower(vehicle.getFiscalPower())
                        .setBrand(vehicle.getBrand())
                        .build();
                builder.addVehicules(vehiculeresponse);
            }
            Immatriculation.Owner response=Immatriculation.Owner.newBuilder()
                    .setId(Math.toIntExact(owner.getId()))
                    .setEmail(owner.getEmail())
                    .setBirthDate(owner.getBirthDate()+"")
                    .setFirstname(owner.getFirstname())
                    .setLastname(owner.getLastname())
                    .setVehicules(builder)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void oneOwner(Immatriculation.OwnerId request, StreamObserver<Immatriculation.Owner> responseObserver) {
        Long id= request.getId();
        Owner owner=ownerRepository.findById(id).orElse(null);

        Immatriculation.VehiculeList.Builder builder=Immatriculation.VehiculeList.newBuilder();
        for (Vehicle vehicle:owner.getVehicles()){
            Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                    .setLicensePlate(vehicle.getLicensePlate())
                    .setId(Math.toIntExact(vehicle.getId()))
                    .setModel(vehicle.getModel())
                    .setFiscalPower(vehicle.getFiscalPower())
                    .setBrand(vehicle.getBrand())
                    .build();
            builder.addVehicules(vehiculeresponse);
        }
        Immatriculation.Owner response=Immatriculation.Owner.newBuilder()
                .setId(Math.toIntExact(owner.getId()))
                .setEmail(owner.getEmail())
                .setBirthDate(owner.getBirthDate()+"")
                .setFirstname(owner.getFirstname())
                .setLastname(owner.getLastname())
                .setVehicules(builder)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void oneVehicule(Immatriculation.VehicleId request, StreamObserver<Immatriculation.Vehicule> responseObserver) {
        Long id=request.getId();
        Vehicle vehicle=vehicleRepository.findById(id).orElse(null);
        Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                .setLicensePlate(vehicle.getLicensePlate())
                .setId(Math.toIntExact(vehicle.getId()))
                .setModel(vehicle.getModel())
                .setFiscalPower(vehicle.getFiscalPower())
                .setBrand(vehicle.getBrand())
                .build();
        responseObserver.onNext(vehiculeresponse);
        responseObserver.onCompleted();

    }

    @Override
    public void editVehicule(Immatriculation.Vehicule request, StreamObserver<Immatriculation.Vehicule> responseObserver) {
        Long id=request.getId();
        Vehicle vehicle=vehicleRepository.findById(id).orElse(null);
        if(vehicle!=null){
            if(request.getBrand()!=null) vehicle.setBrand(request.getBrand());
            if(request.getModel()!=null) vehicle.setModel(request.getModel());
            if(request.getLicensePlate()!=null) vehicle.setLicensePlate(request.getLicensePlate());
            if(request.getFiscalPower()!=0) vehicle.setFiscalPower(request.getFiscalPower());
            vehicle=vehicleRepository.save(vehicle);

            Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                    .setLicensePlate(vehicle.getLicensePlate())
                    .setId(Math.toIntExact(vehicle.getId()))
                    .setModel(vehicle.getModel())
                    .setFiscalPower(vehicle.getFiscalPower())
                    .setBrand(vehicle.getBrand())
                    .build();
            responseObserver.onNext(vehiculeresponse);
            responseObserver.onCompleted();
        }
    }


    @Override
    public void addOwner(Immatriculation.Owner request, StreamObserver<Immatriculation.Owner> responseObserver) {
        SimpleDateFormat  df = new SimpleDateFormat ("dd/MM/YYYY");
        df.setLenient(true);
        Date date = null;
        try {
            date = df.parse(request.getBirthDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Owner owner=ownerRepository.save(new Owner(
                null,request.getFirstname(),request.getLastname(),date,request.getEmail(),null
        ));

        Immatriculation.VehiculeList.Builder builder=Immatriculation.VehiculeList.newBuilder();
        if (owner.getVehicles()!=null)
            for (Vehicle vehicle:owner.getVehicles()){
                Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                        .setLicensePlate(vehicle.getLicensePlate())
                        .setId(Math.toIntExact(vehicle.getId()))
                        .setModel(vehicle.getModel())
                        .setFiscalPower(vehicle.getFiscalPower())
                        .setBrand(vehicle.getBrand())
                        .build();
                builder.addVehicules(vehiculeresponse);
            }
        Immatriculation.Owner response=Immatriculation.Owner.newBuilder()
                .setId(Math.toIntExact(owner.getId()))
                .setEmail(owner.getEmail())
                .setBirthDate(owner.getBirthDate()+"")
                .setFirstname(owner.getFirstname())
                .setLastname(owner.getLastname())
                .setVehicules(builder)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void addVehicule(Immatriculation.Vehicule request, StreamObserver<Immatriculation.Vehicule> responseObserver) {
        Long idOwner=request.getOwner().getId();
        Owner owner=ownerRepository.findById(idOwner).orElse(null);
        Vehicle vehicle=vehicleRepository.save(new Vehicle(
                null,request.getLicensePlate(),request.getBrand(),request.getFiscalPower(),request.getModel(),owner));

        Immatriculation.Vehicule vehiculeresponse=Immatriculation.Vehicule.newBuilder()
                .setLicensePlate(vehicle.getLicensePlate())
                .setId(Math.toIntExact(vehicle.getId()))
                .setModel(vehicle.getModel())
                .setFiscalPower(vehicle.getFiscalPower())
                .setBrand(vehicle.getBrand())
                .build();
        responseObserver.onNext(vehiculeresponse);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteOwner(Immatriculation.OwnerId request, StreamObserver<Immatriculation.Empty> responseObserver) {
        ownerRepository.deleteById(request.getId());
        Immatriculation.Empty empty=Immatriculation.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteVehicule(Immatriculation.VehicleId request, StreamObserver<Immatriculation.Empty> responseObserver) {
        vehicleRepository.deleteById(request.getId());
        Immatriculation.Empty empty=Immatriculation.Empty.newBuilder().build();
        responseObserver.onNext(empty);
        responseObserver.onCompleted();
    }
}

