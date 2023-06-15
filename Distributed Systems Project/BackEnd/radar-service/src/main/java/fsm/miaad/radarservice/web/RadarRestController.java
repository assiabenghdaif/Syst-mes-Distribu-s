package fsm.miaad.radarservice.web;

import fsm.miaad.radarservice.entities.Radar;
import fsm.miaad.radarservice.services.feign.RadarServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("radars")
public class RadarRestController {
    private RadarServiceImp radarService;

    public RadarRestController(RadarServiceImp radarService) {
        this.radarService = radarService;
    }

    @GetMapping("/allRadars")
    public List<Radar> allRadars(){
        return radarService.allRadars();
    }

    @GetMapping("oneRadar/{id}")
    public Radar oneRadar(@PathVariable Long id){
        return radarService.oneRadar(id);
    }

    @PostMapping("addRadar")
    public Radar addRadar(@RequestBody Radar radar){
        return radarService.addRadar(radar);
    }

    @PutMapping("editRadar/{id}")
    public Radar editRadar(@PathVariable Long id, @RequestBody Radar radar){
        return radarService.editRadar(id,radar);
    }

    @DeleteMapping("deleteRadar/{id}")
    public ResponseEntity<HttpStatus> deleteRadar(@PathVariable Long id){

        radarService.deleteRadar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    
}
