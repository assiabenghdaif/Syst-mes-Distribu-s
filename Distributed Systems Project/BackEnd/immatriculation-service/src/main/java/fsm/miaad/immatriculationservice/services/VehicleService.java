package fsm.miaad.immatriculationservice.services;


import fsm.miaad.immatriculationservice.entities.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Vehicle getById_Vehicle(Long id);
    Vehicle insert_Vehicle(Vehicle vehicle);
    Vehicle update_Vehicle(Long id, Vehicle vehicle);
    void delete_Vehicle(Long id);
    List<Vehicle> getVehicleByBrand(String brand);

}
