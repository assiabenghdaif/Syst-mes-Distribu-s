package fsm.miaad.billingservice.web;

import fsm.miaad.billingservice.entities.Bill;
import fsm.miaad.billingservice.models.Customer;
import fsm.miaad.billingservice.models.Product;
import fsm.miaad.billingservice.repositories.BillRepository;
import fsm.miaad.billingservice.repositories.ProductItemRepository;
import fsm.miaad.billingservice.servicesfeign.CustomerRestClient;
import fsm.miaad.billingservice.servicesfeign.ProductItemRestClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillingRestController {

    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;
    private ProductItemRestClient productItemRestClient;

    public BillingRestController(BillRepository billRepository, ProductItemRepository productItemRepository, CustomerRestClient customerRestClient, ProductItemRestClient productItemRestClient) {
        this.billRepository = billRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClient = customerRestClient;
        this.productItemRestClient = productItemRestClient;
    }

    @GetMapping(path = "/fullbill/{id}")
    public Bill getBill(@PathVariable(name = "id") Long id){
        Bill bill=billRepository.findById(id).get();
        Customer customer=customerRestClient.getCustomerById(bill.getCustomerID());
//        bill.setCustomer(customer);
        bill.setCustomerEmail(customer.getEmail());
        bill.setCustomerName(customer.getName());
        bill.getProductItems().forEach(productItem -> {
            Product product=productItemRestClient.getProductById(productItem.getProductID());
//            productItem.setProduct(product);
            productItem.setProductName(product.getName());
        });
        return bill;

    }

    @GetMapping(path = "/billcount")
    public int countBills(){
        List<Bill> bills=billRepository.findAll();
        int count=0;
        for(Bill b:bills) count++;
        System.out.println(count);
        return  count;
    }
}
