package pfizer.bootcamp.group5.Sacchon.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class PatientRecords {
    @Id
    private int id;

    private double glucose;
    private double carbonates;
    private Date time;
}
