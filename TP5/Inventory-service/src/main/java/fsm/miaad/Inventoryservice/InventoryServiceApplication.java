package fsm.miaad.Inventoryservice;

import fsm.miaad.Inventoryservice.entities.Product;
import fsm.miaad.Inventoryservice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Product.class);
		return args -> {
			productRepository.save(new Product(null,"laptop",2001,12));
			productRepository.save(new Product(null,"mouse",20,16));
			productRepository.save(new Product(null,"keyboard",200,10));
			productRepository.findAll().forEach(
					product -> {
						System.out.println(product.toString());
					}
			);
		};
	}
}



