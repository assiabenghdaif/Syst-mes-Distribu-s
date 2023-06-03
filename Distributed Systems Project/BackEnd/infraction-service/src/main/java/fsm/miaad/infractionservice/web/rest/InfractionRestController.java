package fsm.miaad.infractionservice.web.rest;

import fsm.miaad.infractionservice.entities.Infraction;
import fsm.miaad.infractionservice.services.InfractionServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("infraction-service/rest")
public class InfractionRestController {
    
    private InfractionServiceImp infractionService;

    public InfractionRestController(InfractionServiceImp infractionService) {
        this.infractionService = infractionService;
    }
    
    @GetMapping("allInfractions")
    public List<Infraction> allInfractions(){
        return infractionService.getAllInfractions();
    }

    @GetMapping("oneInfraction/{id}")
    public Infraction oneInfraction(@PathVariable Long id){
        return infractionService.getById_Infraction(id);
    }

    @PostMapping("addInfraction")
    public Infraction addInfraction(@RequestBody Infraction infraction){
        return infractionService.insert_Infraction(infraction);
    }

    @PutMapping("editInfraction/{id}")
    public Infraction editInfraction(@PathVariable Long id, @RequestBody Infraction infraction){
        return infractionService.update_Infraction(id,infraction);
    }

    @DeleteMapping("deleteInfraction/{id}")
    public ResponseEntity<HttpStatus> deleteInfraction(@PathVariable Long id){
        infractionService.delete_Infraction(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
