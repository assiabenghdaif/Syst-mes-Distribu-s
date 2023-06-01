package fsm.miaad.entities;

import fsm.miaad.models.Offense;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Radar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double maxSpeed;
    private double longitude;
    private double latitude;
//    @OneToMany(mappedBy = "radar")
    @Transient
    private Collection<Offense> offenses;
}
