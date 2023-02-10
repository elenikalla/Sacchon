package pfizer.bootcamp.group5.Sacchon.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class Consultation {
    @Id
    private int id;

    private Date timeCreated;
    private String consultationComment;
    private Date timeSeen;


}
