package fsm.miaad.immatriculationservice.web.rest;

import fsm.miaad.immatriculationservice.entities.Owner;
import fsm.miaad.immatriculationservice.services.OwnerServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/immatriculation-service/owners/rest/")
public class OwnerRestController {

    private OwnerServiceImp ownerService;
    public  OwnerRestController(OwnerServiceImp ownerService){
        this.ownerService=ownerService;
    }

    @GetMapping("allOwners")
    public List<Owner> allOwners(){
        return ownerService.getAllOwners();
    }

    @GetMapping("oneOwner/{id}")
    public Owner oneOwner(@PathVariable Long id){
        return ownerService.getById_Owner(id);
    }

    @PostMapping("addOwner")
    public Owner addOwner(@RequestBody Owner owner){
        return ownerService.insert_Owner(owner);
    }

    @PutMapping("editOwner/{id}")
    public Owner editOwner(@PathVariable Long id, @RequestBody Owner owner){
        return ownerService.update_Owner(id,owner);
    }

    @DeleteMapping("deleteOwner/{id}")
    public ResponseEntity<HttpStatus> deleteOwner(@PathVariable Long id){
        ownerService.delete_Owner(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @GetMapping("allOwnersByBrand/{brand}")
//    public List<Owner> allOwnersByBrand(@PathVariable String brand){
//        return ownerService.getAllOwnersByBrand(brand);
//    }


}
