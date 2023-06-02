package fsm.miaad.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Builder
public class Vehicle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String licensePlate;
    private String brand;
    private int fiscalPower;
    private String model;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Owner owner;
}
