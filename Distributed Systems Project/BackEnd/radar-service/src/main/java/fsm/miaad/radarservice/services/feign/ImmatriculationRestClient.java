package fsm.miaad.radarservice.services.feign;

import fsm.miaad.radarservice.models.Owner;
import fsm.miaad.radarservice.models.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {

    String _URLve="/vehicles/";
    String _URLow="/owners/";

    @GetMapping(_URLve+"VehicleByLicensePlate/{licensePlate}")
    Vehicle getByLicensePlate(@PathVariable String licensePlate);

    @GetMapping(_URLow+"oneOwner/{id}")
    Owner getOwner(@PathVariable Long id);

    @GetMapping(_URLow+"allOwners")
    List<Owner> allOwners();

    @GetMapping(_URLve+"oneVehicle/{id}")
    Vehicle VehicleById(@PathVariable Long id);

    @GetMapping(_URLve+"allVehicles")
    List<Vehicle> allVehicles();


}
