package fsm.miaad.radarservice.entities;

import fsm.miaad.radarservice.models.Infraction;
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
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double maxSpeed;
    private double longitude;
    private double latitude;
//    @OneToMany(mappedBy = "radar")
    @Transient
    private Collection<Infraction> infractions;
}
