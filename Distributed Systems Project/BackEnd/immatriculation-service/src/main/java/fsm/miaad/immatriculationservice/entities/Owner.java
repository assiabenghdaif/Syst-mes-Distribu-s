package fsm.miaad.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Builder
public class Owner {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private Date birthDate;
    private String email;
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "owner",cascade = CascadeType.ALL)
    private Collection<Vehicle> vehicles;
}
