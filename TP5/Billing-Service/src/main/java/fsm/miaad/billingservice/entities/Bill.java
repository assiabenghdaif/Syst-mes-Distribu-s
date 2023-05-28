package fsm.miaad.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fsm.miaad.billingservice.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Bill {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
//    @JsonIgnore
    private Long customerID;
    @JsonIgnore
    @Transient
    private Customer customer;

    @Transient
    private String customerName;

    @Transient
    private String customerEmail;



}
