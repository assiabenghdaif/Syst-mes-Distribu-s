package fsm.miaad.radarservice.models;

import fsm.miaad.radarservice.entities.Radar;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Infraction {

    private Long id;
    private Date date;
    private Long radarId;
    private String vehicleLicensePlate; //matricule
    private double vehicleSpeed; //la vitesse du véhicule,
    private double maxSpeed; //la vitesse maximale du radar
    private double amount;
//    private Radar radar;
    private Vehicle vehicle;
}
