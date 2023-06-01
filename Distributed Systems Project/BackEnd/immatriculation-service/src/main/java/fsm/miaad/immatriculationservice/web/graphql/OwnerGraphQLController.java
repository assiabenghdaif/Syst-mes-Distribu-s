package fsm.miaad.immatriculationservice.web.graphql;

import fsm.miaad.immatriculationservice.entities.Owner;
import fsm.miaad.immatriculationservice.services.OwnerServiceImp;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/immatriculation-service/owners/graphql")
public class OwnerGraphQLController {

    private OwnerServiceImp ownerService;
    public OwnerGraphQLController(OwnerServiceImp ownerService){
        this.ownerService=ownerService;
    }

    @QueryMapping
    public List<Owner> allOwners(){
        return ownerService.getAllOwners();
    }

    @QueryMapping
    public Owner oneOwner(@Argument Long id){
        return ownerService.getById_Owner(id);
    }

    @MutationMapping
    public Owner addOwner(@Argument Owner owner){
        return ownerService.insert_Owner(owner);
    }

    @MutationMapping
    public Owner editOwner(@Argument Long id, @Argument Owner owner){
        return ownerService.update_Owner(id,owner);
    }

    @QueryMapping
    public String deleteOwner(@Argument Long id){
        ownerService.delete_Owner(id);
        return "OK";
    }

//    @GetMapping("allOwnersByBrand/{brand}")
//    public List<Owner> allOwnersByBrand(@PathVariable String brand){
//        return ownerService.getAllOwnersByBrand(brand);
//    }


}
