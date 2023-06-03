package fsm.miaad.infractionservice.entities;

import fsm.miaad.infractionservice.models.Radar;
import fsm.miaad.infractionservice.models.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Infraction {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Long radarId;
    private String vehicleLicensePlate; //matricule
    private double vehicleSpeed; //la vitesse du véhicule,
    private double maxSpeed; //la vitesse maximale du radar
    private double amount;
//    @Transient
//    private Radar radar;
//    @Transient
//    private Vehicle vehicle;

}

/**    private int id;
 private Date date;
 private int radarId;
 private String vehicleLicensePlate;
 private double vehicleSpeed;
 private double maxSpeed;
 private double fineAmount;**/