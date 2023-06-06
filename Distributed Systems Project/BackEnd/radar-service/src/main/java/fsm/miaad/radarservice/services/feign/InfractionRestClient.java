package fsm.miaad.radarservice.services.feign;

import fsm.miaad.radarservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "INFRACTION-SERVICE/infractions")
public interface InfractionRestClient {
    @GetMapping("findByRadarId/{radarId}")
    List<Infraction> allInfractions(@PathVariable Long radarId);

    @PostMapping("addInfraction")
    Infraction addInfraction(@RequestBody Infraction infraction);

    }
