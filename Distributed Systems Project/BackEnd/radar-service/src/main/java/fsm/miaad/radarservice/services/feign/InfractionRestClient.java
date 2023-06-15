package fsm.miaad.radarservice.services.feign;

import fsm.miaad.radarservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "INFRACTION-SERVICE/infractions")
public interface InfractionRestClient {
    @GetMapping("findByRadarId/{radarId}")
    List<Infraction> allInfractions(@PathVariable Long radarId);

    @PostMapping("addInfraction")
    Infraction addInfraction(@RequestBody Infraction infraction);


    @DeleteMapping("deleteInfraction/{id}")
    ResponseEntity<HttpStatus> deleteInfraction(@PathVariable Long id);

}