package fsm.miaad.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;


@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Vehicle {

    private Long id;
    private String licensePlate;
    private String brand;
    private int fiscalPower;
    private String model;
    @ManyToOne
    private Owner owner;
    @OneToMany(mappedBy = "vehicle")
    private Collection<Offense> offenses;


}
