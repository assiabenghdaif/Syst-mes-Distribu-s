package fsm.miaad.immatriculationservice.web.soap;

import fsm.miaad.immatriculationservice.entities.*;
import fsm.miaad.immatriculationservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

@Component
@WebService
public class CompteController {

    @Autowired public VehicleRepository vehicleRepository;
    @Autowired public OwnerRepository ownerRepository;

    @WebMethod
    public List<Owner> allOwners(){
        return ownerRepository.findAll();
    }

    @WebMethod
    public Owner getById_Owner(@WebParam Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Owner insert_Owner(@WebParam Owner owner) {
        return ownerRepository.save((owner));
    }

   @WebMethod
    public Owner update_Owner(@WebParam Long id, @WebParam Owner owner) {
        Owner owner1=getById_Owner(id);
        if(owner1!=null){
            if(owner.getFirstname()!=null) owner1.setFirstname(owner.getFirstname());
            if(owner.getEmail()!=null) owner1.setEmail(owner.getEmail());
            if(owner.getLastname()!=null) owner1.setLastname(owner.getLastname());
            if(owner.getBirthDate()!=null) owner1.setBirthDate(owner.getBirthDate());
            if(owner.getVehicles()!=null) owner1.setVehicles(owner.getVehicles());
            owner1=insert_Owner(owner1);
        }
        return owner1;
    }

    @WebMethod
    public void delete_Owner(@WebParam Long id) {
        ownerRepository.deleteById(id);
    }

    /**Vehicle Services **/

    @WebMethod
    public List<Vehicle> allVehicles(){
        return vehicleRepository.findAll();
    }

    @WebMethod
    public Vehicle addVehicle(@WebParam Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getById_Vehicle(@WebParam Long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Vehicle update_Vehicle(@WebParam Long id,@WebParam Vehicle vehicle) {
        Vehicle vehicle1=getById_Vehicle(id);
        if(vehicle1!=null){
            if(vehicle.getModel()!=null) vehicle1.setModel(vehicle.getModel());
            if(vehicle.getBrand()!=null) vehicle1.setBrand(vehicle.getBrand());
            if(vehicle.getFiscalPower()!=0) vehicle1.setFiscalPower(vehicle.getFiscalPower());
            if(vehicle.getLicensePlate()!=null) vehicle1.setLicensePlate(vehicle.getLicensePlate());
            if(vehicle.getOwner()!=null) vehicle1.setOwner(vehicle.getOwner());
            vehicle1=addVehicle(vehicle1);
        }
        return vehicle1;
    }

    @WebMethod
    public void delete_Vehicle(@WebParam Long id) {
        vehicleRepository.deleteById(id);
    }
}
