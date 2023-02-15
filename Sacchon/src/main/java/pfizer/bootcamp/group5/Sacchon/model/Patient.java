package pfizer.bootcamp.group5.Sacchon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private int amkaCode;
    private LocalDate dateOfBirth;
    private boolean hasRecordings;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name ="doctor_id",referencedColumnName="id")
    private Doctor currentDoctor;
}
