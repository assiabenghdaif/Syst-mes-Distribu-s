package fsm.miaad.immatriculationservice.services;

import fsm.miaad.immatriculationservice.entities.Owner;
import fsm.miaad.immatriculationservice.entities.Vehicle;
import fsm.miaad.immatriculationservice.repositories.OwnerRepository;
import fsm.miaad.immatriculationservice.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OwnerServiceImp implements OwnerService{
    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    VehicleServiceImp vehicleService;
    @Override
    public List<Owner> getAllOwners() {
        List<Owner> owners=ownerRepository.findAll();
        List<Owner> owners1=new ArrayList<>();
        for (Owner owner:owners) {
            ArrayList<Vehicle> vehicles=new ArrayList<>();
            for (Vehicle vehicle : owner.getVehicles()) {
                vehicles.add(vehicle);
            }
            Owner owner1=new Owner(owner.getId(),owner.getFirstname(),owner.getLastname(),owner.getBirthDate(),owner.getEmail(),vehicles);

            owners1.add(owner1);
        }
        return owners1;
    }

    @Override
    public Owner getById_Owner(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner insert_Owner(Owner owner) {
        return ownerRepository.save((owner));
    }

    @Override
    public Owner update_Owner(Long id, Owner owner) {
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

    @Override
    public void delete_Owner(Long id) {
        ownerRepository.deleteById(id);
    }


}
