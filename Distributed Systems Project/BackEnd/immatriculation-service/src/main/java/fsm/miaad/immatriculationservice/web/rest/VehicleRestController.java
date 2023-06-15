package fsm.miaad.immatriculationservice.web.rest;

import fsm.miaad.immatriculationservice.entities.Vehicle;
import fsm.miaad.immatriculationservice.services.VehicleServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/immatriculation-service/vehicles/rest/")
@RequestMapping("/vehicles")
public class VehicleRestController {
    private VehicleServiceImp vehicleService;

    public VehicleRestController(VehicleServiceImp vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("allVehicles")
    public List<Vehicle> allVehicles(){
        return vehicleService.getAllVehicles();
    }

    @GetMapping("oneVehicle/{id}")
    public Vehicle oneVehicle(@PathVariable Long id){
        return vehicleService.getById_Vehicle(id);
    }

    @PostMapping("addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        System.out.println(vehicle.getOwner().getFirstname());
        return vehicleService.insert_Vehicle(vehicle);
    }

    @PutMapping("editVehicle/{id}")
    public Vehicle editVehicle(@PathVariable Long id,@RequestBody Vehicle vehicle){
        return vehicleService.update_Vehicle(id, vehicle);
    }

    @DeleteMapping("deleteVehicle/{id}")
    public ResponseEntity<HttpStatus> deleteVehicle(@PathVariable Long id){
        vehicleService.delete_Vehicle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("VehicleByLicensePlate/{licensePlate}")
    public Vehicle getByLicensePlate(@PathVariable String licensePlate) {
        return vehicleService.getByLicensePlate(licensePlate);
    }
}
