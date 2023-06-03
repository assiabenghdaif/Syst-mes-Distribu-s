package fsm.miaad.infractionservice;

import fsm.miaad.infractionservice.entities.Infraction;
import fsm.miaad.infractionservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class InfractionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfractionServiceApplication.class, args);
		System.out.println("===================================================");
	}

	@Bean
	CommandLineRunner start(InfractionRepository infractionRepository, RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Infraction.class);
		return args -> {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			// Infraction(Long id, Date date, Long radarId, String vehicleLicensePlate, double vehicleSpeed, double maxSpeed, double amount)
			infractionRepository.save(new Infraction(null,dateFormat.parse("12/12/2023"),1L,"78945-b-20",120L,100L,300L));
			infractionRepository.save(new Infraction(null,dateFormat.parse("12/05/2023"),1L,"78945-b-20",80L,60,300L));
			infractionRepository.save(new Infraction(null,dateFormat.parse("12/02/2023"),2L,"13456-A-34",120L,100L,300L));

		};
	}

}
