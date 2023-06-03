package fsm.miaad.infractionservice.services;

import fsm.miaad.infractionservice.entities.Infraction;
import fsm.miaad.infractionservice.repositories.InfractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InfractionServiceImp implements InfractionService{
    @Autowired
    InfractionRepository infractionRepository;

    @Override
    public List<Infraction> getAllInfractions() {
        return infractionRepository.findAll();
    }

    @Override
    public Infraction getById_Infraction(Long id) {
        return infractionRepository.findById(id).orElse(null);
    }

    @Override
    public Infraction insert_Infraction(Infraction infraction) {
        return infractionRepository.save(infraction);
    }

    @Override
    public Infraction update_Infraction(Long id, Infraction infraction) {
        Infraction infraction1=getById_Infraction(id);
        if(infraction1!=null){
            if(infraction.getAmount()!=0)   infraction1.setAmount(infraction.getAmount());
            if(infraction.getDate()!=null)   infraction1.setDate(infraction.getDate());
            if(infraction.getVehicleSpeed()!=0)   infraction1.setVehicleSpeed(infraction.getVehicleSpeed());
            if(infraction.getRadarId()!=null)   infraction1.setRadarId(infraction.getRadarId());
            if(infraction.getMaxSpeed()!=0)   infraction1.setMaxSpeed(infraction.getMaxSpeed());
            if(infraction.getVehicleLicensePlate()!=null)   infraction1.setVehicleLicensePlate(infraction.getVehicleLicensePlate());
            infraction1=insert_Infraction(infraction1);
        }

        return infraction1;
    }

    @Override
    public void delete_Infraction(Long id) {
        Infraction infraction=getById_Infraction(id);
        if(infraction!=null) infractionRepository.deleteById(infraction.getId());

    }

    @Override
    public List<Infraction> findByRadarId(Long radarId){
        return infractionRepository.findByRadarId(radarId);
    }
}
