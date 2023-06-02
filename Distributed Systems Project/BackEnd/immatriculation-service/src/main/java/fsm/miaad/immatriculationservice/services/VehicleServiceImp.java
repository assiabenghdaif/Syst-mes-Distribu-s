package fsm.miaad.immatriculationservice.services;


import fsm.miaad.immatriculationservice.entities.Owner;
import fsm.miaad.immatriculationservice.entities.Vehicle;
import fsm.miaad.immatriculationservice.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VehicleServiceImp implements VehicleService{
    @Autowired
    VehicleRepository vehicleRepository;
    @Override
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles=vehicleRepository.findAll();
        List<Vehicle> vehicles1=new ArrayList<>();
        for (Vehicle vehicle:vehicles) {
            vehicle.setOwner(vehicle.getOwner());
            vehicles1.add(vehicle);
        }

//        for (Vehicle vehicle:vehicles)
//            vehicles.add(vehicle);
        return vehicles1;
    }

    @Override
    public Vehicle getById_Vehicle(Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicle insert_Vehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle update_Vehicle(Long id, Vehicle vehicle) {
        Vehicle vehicle1=getById_Vehicle(id);
        if(vehicle1!=null){
            if(vehicle.getModel()!=null) vehicle1.setModel(vehicle.getModel());
            if(vehicle.getBrand()!=null) vehicle1.setBrand(vehicle.getBrand());
            if(vehicle.getFiscalPower()!=0) vehicle1.setFiscalPower(vehicle.getFiscalPower());
            if(vehicle.getLicensePlate()!=null) vehicle1.setLicensePlate(vehicle.getLicensePlate());
            if(vehicle.getOwner()!=null) vehicle1.setOwner(vehicle.getOwner());
            vehicle1=insert_Vehicle(vehicle1);
        }
        return vehicle1;
    }

    @Override
    public void delete_Vehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public List<Vehicle> getVehicleByBrand(String brand) {
        List<Vehicle> vehicles=new ArrayList<>();;

        for (Vehicle vehicle:vehicleRepository.findByBrand(brand))
            vehicles.add((vehicle));
        return vehicles;

    }
}
