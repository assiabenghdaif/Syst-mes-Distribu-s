package fsm.miaad.immatriculationservice.services;

import fsm.miaad.immatriculationservice.entities.Owner;

import java.util.List;

public interface OwnerService {
    List<Owner> getAllOwners();
    Owner getById_Owner(Long id);
    Owner insert_Owner(Owner owner);
    Owner update_Owner(Long id, Owner owner);
    void delete_Owner(Long id);


}
