package fsm.miaad.billingservice.servicesfeign;

import fsm.miaad.billingservice.models.Customer;
import fsm.miaad.billingservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Vector;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {

    @GetMapping(path = "/customers/{id}")
    Customer getCustomerById(@PathVariable(name = "id") Long id);

    @GetMapping(path = "/customers")
    PagedModel<Customer> pageCustomers();
}
