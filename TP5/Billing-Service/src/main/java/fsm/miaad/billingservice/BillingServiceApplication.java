package fsm.miaad.billingservice;

import fsm.miaad.billingservice.entities.Bill;
import fsm.miaad.billingservice.entities.ProductItem;
import fsm.miaad.billingservice.models.Customer;
import fsm.miaad.billingservice.models.Product;
import fsm.miaad.billingservice.repositories.BillRepository;
import fsm.miaad.billingservice.repositories.ProductItemRepository;
import fsm.miaad.billingservice.servicesfeign.CustomerRestClient;
import fsm.miaad.billingservice.servicesfeign.ProductItemRestClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import java.util.Collection;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
		System.out.println("========================================");
	}

	@Bean
	CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository, CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient){
		return args -> {
			Vector<Bill> bills=new Vector<>();
			PagedModel<Customer> customerPagedModel=customerRestClient.pageCustomers();
			customerPagedModel.forEach(customer -> {
				bills.add(billRepository.save(new Bill(null,new Date(),null,customer.getId(),null,null,null)));
			});

//			Customer customer=customerRestClient.getCustomerById(1L);
//			Bill bill=billRepository.save(new Bill(null,new Date(),null,customer.getId(),null,null,null));

			int i=0;
			PagedModel<Product> productPagedModel=productItemRestClient.pageProducts();
			for (Product product : productPagedModel) {
				ProductItem productItem = new ProductItem();
				productItem.setPrice(product.getPrice());
				productItem.setProductID(product.getId());
				productItem.setQuatity(1 + new Random().nextInt(100));
				productItem.setBill(bills.get(i));
				i++;
				productItemRepository.save(productItem);

			}

		};
	}
}
