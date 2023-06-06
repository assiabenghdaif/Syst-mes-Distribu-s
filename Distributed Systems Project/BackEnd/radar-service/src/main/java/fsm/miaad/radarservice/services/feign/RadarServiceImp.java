package fsm.miaad.radarservice.services.feign;

import fsm.miaad.radarservice.entities.Radar;
import fsm.miaad.radarservice.models.Infraction;
import fsm.miaad.radarservice.models.Owner;
import fsm.miaad.radarservice.models.Vehicle;
import fsm.miaad.radarservice.repositories.RadarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class RadarServiceImp implements RadarService{
    private RadarRepository radarRepository;
    private InfractionRestClient infractionRestClient;
    private ImmatriculationRestClient immatriculationRestClient;
    @Override
    public List<Radar> allRadars() {
        List<Radar> radars=radarRepository.findAll();
        for (Radar radar:radars){
            List<Infraction> infractions=infractionRestClient.allInfractions(radar.getId());

            radar.setInfractions(infractions);
            for(Infraction infraction:radar.getInfractions()){
                infraction.setVehicle(immatriculationRestClient.getByLicensePlate(infraction.getVehicleLicensePlate()));
                Vehicle vehicle=infraction.getVehicle();
                List<Owner> owners=immatriculationRestClient.allOwners();
                for(Owner owner:owners){
                    for(Vehicle vehicle1:owner.getVehicles()){
                        if(vehicle1.getLicensePlate().equals(vehicle.getLicensePlate())){
                            vehicle.setOwner(owner);
                        }
                    }
                }
            }
        }
        return radars;
    }

    @Override
    public Radar oneRadar(Long id) {
        Radar radar=radarRepository.findById(id).orElse(null);
        if(radar!=null){
            List<Infraction> infractions=infractionRestClient.allInfractions(radar.getId());

            radar.setInfractions(infractions);
            for(Infraction infraction:radar.getInfractions()){
                infraction.setVehicle(immatriculationRestClient.getByLicensePlate(infraction.getVehicleLicensePlate()));
                Vehicle vehicle=infraction.getVehicle();
                List<Owner> owners=immatriculationRestClient.allOwners();
                for(Owner owner:owners){
                    for(Vehicle vehicle1:owner.getVehicles()){
                        if(vehicle1.getLicensePlate().equals(vehicle.getLicensePlate())){
                            vehicle.setOwner(owner);
                        }
                    }
                }
            }
        }
        return radar;
    }

    @Override
    public Radar addRadar(Radar radar) {
        radar=radarRepository.save(radar);
        List<Infraction> infractions=infractionRestClient.allInfractions(radar.getId());

        radar.setInfractions(infractions);
        for(Infraction infraction:radar.getInfractions()){
            infraction.setVehicle(immatriculationRestClient.getByLicensePlate(infraction.getVehicleLicensePlate()));
            Vehicle vehicle=infraction.getVehicle();
            List<Owner> owners=immatriculationRestClient.allOwners();
            for(Owner owner:owners){
                for(Vehicle vehicle1:owner.getVehicles()){
                    if(vehicle1.getLicensePlate().equals(vehicle.getLicensePlate())){
                        vehicle.setOwner(owner);
                    }
                }
            }
        }
        return radar;
    }

    @Override
    public Radar editRadar(Long id, Radar radar) {
        Radar radar1=oneRadar(id);
        if(radar1!=null){
            if(radar.getLatitude()!=0)  radar1.setLatitude(radar.getLatitude());
            if(radar.getLongitude()!=0)  radar1.setLongitude(radar.getLongitude());
            if(radar.getMaxSpeed()!=0)  radar1.setMaxSpeed(radar.getMaxSpeed());
            radar1=addRadar(radar1);
            List<Infraction> infractions=infractionRestClient.allInfractions(radar1.getId());

            radar1.setInfractions(infractions);
            for(Infraction infraction:radar1.getInfractions()){
                infraction.setVehicle(immatriculationRestClient.getByLicensePlate(infraction.getVehicleLicensePlate()));
                Vehicle vehicle=infraction.getVehicle();
                List<Owner> owners=immatriculationRestClient.allOwners();
                for(Owner owner:owners){
                    for(Vehicle vehicle1:owner.getVehicles()){
                        if(vehicle1.getLicensePlate().equals(vehicle.getLicensePlate())){
                            vehicle.setOwner(owner);
                        }
                    }
                }
            }
        }
        return radar1;
    }

    @Override
    public void deleteRadar(Long id) {
        Radar radar=oneRadar(id);
        if (radar!=null) radarRepository.deleteById(id);

    }

}
