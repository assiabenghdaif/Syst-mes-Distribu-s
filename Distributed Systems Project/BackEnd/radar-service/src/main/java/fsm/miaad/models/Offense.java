package fsm.miaad.models;

import fsm.miaad.entities.Radar;
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
public class Offense {

    private Long id;
    private Date date;
    private double vehicleSpeed;
    private double maxSpeed;
    private double fineAmount;
    @ManyToOne
    private Radar radar;

    @ManyToOne
    private Vehicle vehicle;
}
