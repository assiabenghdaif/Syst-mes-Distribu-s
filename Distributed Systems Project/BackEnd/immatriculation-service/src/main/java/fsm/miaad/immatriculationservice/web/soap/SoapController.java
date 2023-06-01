package fsm.miaad.immatriculationservice.web.soap;


import fsm.miaad.immatriculationservice.entities.Owner;
import fsm.miaad.immatriculationservice.entities.Vehicle;
import fsm.miaad.immatriculationservice.repositories.OwnerRepository;
import fsm.miaad.immatriculationservice.repositories.VehicleRepository;
import fsm.miaad.immatriculationservice.services.OwnerServiceImp;
import fsm.miaad.immatriculationservice.services.VehicleServiceImp;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "soap")
public class SoapController {
    private VehicleRepository vehicleRepository;
    private OwnerRepository ownerRepository;
    private OwnerServiceImp ownerService;
    private VehicleServiceImp vehicleService;
    public SoapController(VehicleServiceImp vehicleService,OwnerServiceImp ownerService,OwnerRepository ownerRepository,VehicleRepository vehicleRepository){
        this.vehicleRepository=vehicleRepository;
        this.ownerRepository=ownerRepository;
        this.vehicleService=vehicleService;
        this.ownerService=ownerService;
    }

    @WebMethod
    public List<Owner> allOwners(){
        return ownerService.getAllOwners();
    }



    @WebMethod
    public List<Vehicle> allVehicles(){
        return vehicleService.getAllVehicles();
    }

    @WebMethod
    public Vehicle addVehicle(@WebParam Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }


}
