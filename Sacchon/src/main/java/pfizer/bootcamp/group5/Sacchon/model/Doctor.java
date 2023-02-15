package pfizer.bootcamp.group5.Sacchon.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String fullName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "currentDoctor")
    private Set<Patient> managedPatients;
}
