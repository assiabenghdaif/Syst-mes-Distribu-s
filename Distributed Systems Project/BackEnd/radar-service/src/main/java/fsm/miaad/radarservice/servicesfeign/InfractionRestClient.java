package fsm.miaad.radarservice.servicesfeign;

import fsm.miaad.radarservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "INFRACTION-SERVICE/infractions")
public interface InfractionRestClient {
    @GetMapping("findByRadarId/{radarId}")
    List<Infraction> allInfractions(@PathVariable Long radarId);
}
