package fsm.miaad.immatriculationservice.web.graphql;

import fsm.miaad.immatriculationservice.entities.Vehicle;
import fsm.miaad.immatriculationservice.services.VehicleServiceImp;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/immatriculation-service/vehicles/graphql")
public class VehicleGraphQLController {
    private VehicleServiceImp vehicleService;

    public VehicleGraphQLController(VehicleServiceImp vehicleService) {
        this.vehicleService = vehicleService;
    }

    @QueryMapping
    public List<Vehicle> allVehicles(){
        return vehicleService.getAllVehicles();
    }

    @QueryMapping
    public Vehicle oneVehicle(@Argument Long id){
        return vehicleService.getById_Vehicle(id);
    }

    @MutationMapping
    public Vehicle addVehicle(@Argument Vehicle vehicle){
        return vehicleService.insert_Vehicle(vehicle);
    }

    @MutationMapping
    public Vehicle editVehicle(@Argument Long id,@Argument Vehicle vehicle){
        return vehicleService.update_Vehicle(id, vehicle);
    }

    @QueryMapping
    public String deleteVehicle(@Argument Long id){
        vehicleService.delete_Vehicle(id);
        return "OK";
    }
}
