package fsm.miaad.immatriculationservice.repositories;

import fsm.miaad.immatriculationservice.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

    List<Vehicle> findByBrand(String brand);
    Vehicle findByLicensePlate(String licensePlate);
}
