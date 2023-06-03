package fsm.miaad.radarservice.servicesfeign;

import fsm.miaad.radarservice.entities.Radar;

import java.util.List;

public interface RadarService {
    List<Radar> allRadars();
    Radar oneRadar(Long id);
    Radar addRadar(Radar radar);
    Radar editRadar(Long id,Radar radar);
    void deleteRadar(Long id);
}
