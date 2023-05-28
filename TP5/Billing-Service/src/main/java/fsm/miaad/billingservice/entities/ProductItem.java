package fsm.miaad.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import fsm.miaad.billingservice.models.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class ProductItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quatity;
    private double price;
    @JsonIgnore
    private Long productID;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Bill bill;


    @JsonIgnore
    @Transient
    private Product product;

    @Transient
    private String productName;
}
