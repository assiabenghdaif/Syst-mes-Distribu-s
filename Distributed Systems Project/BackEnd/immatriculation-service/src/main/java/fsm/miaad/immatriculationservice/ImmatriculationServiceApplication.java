package fsm.miaad.immatriculationservice;

import fsm.miaad.immatriculationservice.entities.*;
import fsm.miaad.immatriculationservice.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

@SpringBootApplication
public class ImmatriculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmatriculationServiceApplication.class, args);
		System.out.println("SOAP Server started, listening on address: *, port: 1234");
		System.out.println("====================================================");
	}

	@Bean
	CommandLineRunner start(OwnerRepository ownerRepository, VehicleRepository vehicleRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Owner.class);
		repositoryRestConfiguration.exposeIdsFor(Vehicle.class);

		return args -> {
			//  UserEntity(Long id, String login, String password, String firstname, String lastname, String profile, List<ContactEntity> contacts)
//			Vector<UserEntity> userEntities=new Vector<>();



			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			ArrayList<Vehicle> vehicles=new ArrayList<>();
			Owner owner1=new Owner(null,"assia","benghdaif",dateFormat.parse("16/04/2001"),"assia@gmail.com",null);
			Owner owner2=new Owner(null,"assia2","benghdaif2",dateFormat.parse("16/04/2001"),"assia2@gmail.com",null);

			Vehicle vehicle1=new Vehicle(null,"78945-b-20","BMW", 7,"3 Series",owner1);
			Vehicle vehicle2=new Vehicle(null,"76324-A-11","Ford", 6,"Focus",owner1);
			Vehicle vehicle3=new Vehicle(null,"13456-A-34","Mercedes‑Benz", 8,"C-Class",owner2);
			owner1=ownerRepository.save(owner1);
			vehicles=new ArrayList<>();
			vehicles.add(vehicleRepository.save(vehicle1));
			vehicles.add(vehicleRepository.save(vehicle2));
			owner1.setVehicles(vehicles);
			ownerRepository.save(owner1);

			owner2=ownerRepository.save(owner2);
			vehicles=new ArrayList<>();
			vehicles.add(vehicleRepository.save(vehicle3));
			owner2.setVehicles(vehicles);
			ownerRepository.save(owner2);


//
		};
	}
}


/**
 *     Brand: BMW
 *         Fiscal Power: 7
 *         Models: 3 Series, 5 Series, X5, X3
 *
 *     Brand: Mercedes-Benz
 *         Fiscal Power: 8
 *         Models: C-Class, E-Class, S-Class, GLC
 *
 *     Brand: Ford
 *         Fiscal Power: 6
 *         Models: Mustang, Focus, Explorer, F-150
 *
 *     Brand: Toyota
 *         Fiscal Power: 6
 *         Models: Corolla, Camry, RAV4, Highlander
 *
 *     Brand: Volkswagen
 *         Fiscal Power: 7
 *         Models: Golf, Passat, Tiguan, Atlas
 *
 *     Brand: Audi
 *         Fiscal Power: 7
 *         Models: A4, A6, Q5, Q7
 *
 *     Brand: Honda
 *         Fiscal Power: 6
 *         Models: Civic, Accord, CR-V, Pilot
 *
 *     Brand: Hyundai
 *         Fiscal Power: 6
 *         Models: Elantra, Sonata, Tucson, Santa Fe
 *
 *     Brand: Nissan
 *         Fiscal Power: 7
 *         Models: Sentra, Altima, Rogue, Pathfinder
 *
 *     Brand: Chevrolet
 *         Fiscal Power: 6
 *         Models: Camaro, Malibu, Equinox, Silverado
 * **/