package fsm.miaad.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class Owner {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private Date birthDate;
    private String email;
    @OneToMany(mappedBy = "owner")
    private Collection<Vehicle> vehicles;
}
