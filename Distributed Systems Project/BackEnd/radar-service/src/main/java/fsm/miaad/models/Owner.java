package fsm.miaad.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Owner {

    private Long id;
    private String firstname;
    private String lastname;
    private Date birthDate;
    private String email;
    @OneToMany(mappedBy = "owner")
    private Collection<Vehicle> vehicles;
}
