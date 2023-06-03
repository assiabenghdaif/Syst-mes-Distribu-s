package fsm.miaad.radarservice;

import fsm.miaad.radarservice.entities.Radar;
import fsm.miaad.radarservice.models.Infraction;
import fsm.miaad.radarservice.repositories.RadarRepository;
import fsm.miaad.radarservice.servicesfeign.InfractionRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
		System.out.println("============================================");
	}

	@Bean
	CommandLineRunner start(RadarRepository radarRepository, RepositoryRestConfiguration restConfiguration, InfractionRestClient infractionRestClient){
		restConfiguration.exposeIdsFor(Radar.class);
		Random random = new Random();
		return args -> {
			Radar radar=new Radar(null,120,random.nextDouble(),random.nextDouble(),null);
			radar=radarRepository.save(radar);
			List<Infraction> infractions=infractionRestClient.allInfractions(radar.getId());
			radar.setInfractions(infractions);
			radarRepository.save(radar);
		};
	}

}
