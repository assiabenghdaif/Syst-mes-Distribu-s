package fsm.miaad.customerservice;

import fsm.miaad.customerservice.Repositories.CustomerRepository;
import fsm.miaad.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Customer.class);
		return args -> {
			customerRepository.save(new Customer(null,"assia1","assia1@gmail.com"));
			customerRepository.save(new Customer(null,"assia2","assia2@gmail.com"));
			customerRepository.save(new Customer(null,"assia3","assia3@gmail.com"));
			customerRepository.findAll().forEach(customer -> {
				System.out.println(customer.toString());
			});
		};
	}
}
