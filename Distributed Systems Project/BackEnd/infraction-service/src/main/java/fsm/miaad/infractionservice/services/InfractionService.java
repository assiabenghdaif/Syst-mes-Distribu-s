package fsm.miaad.infractionservice.services;

import fsm.miaad.infractionservice.entities.Infraction;

import java.util.List;

public interface InfractionService {
    List<Infraction> getAllInfractions();
    Infraction getById_Infraction(Long id);
    Infraction insert_Infraction(Infraction infraction);
    Infraction update_Infraction(Long id, Infraction infraction);
    void delete_Infraction(Long id);

    List<Infraction> findByRadarId(Long radarId);
}
