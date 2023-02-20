package pfizer.bootcamp.group5.Sacchon.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pfizer.bootcamp.group5.Sacchon.model.BloodGlucoseLevel;
import pfizer.bootcamp.group5.Sacchon.model.Patient;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@NoArgsConstructor
public class BGL_Dto {

    private int id;
    private LocalDate date;
    private LocalTime time;
    private Double measurement;
    private Patient patient;


    public BGL_Dto(BloodGlucoseLevel bloodGlucoseLevel) {
        if (bloodGlucoseLevel != null) {
            id = bloodGlucoseLevel.getId();
            date = bloodGlucoseLevel.getDate();
            time = bloodGlucoseLevel.getTime();
            measurement = bloodGlucoseLevel.getMeasurement();
            patient = bloodGlucoseLevel.getPatient();
        }
    }

    public BloodGlucoseLevel asBGL() {
        BloodGlucoseLevel bloodGlucoseLevel = new BloodGlucoseLevel();
        bloodGlucoseLevel.setId(id);
        bloodGlucoseLevel.setDate(date);
        bloodGlucoseLevel.setTime(time);
        bloodGlucoseLevel.setMeasurement(measurement);
        bloodGlucoseLevel.setPatient(patient);

        return bloodGlucoseLevel;
    }
}


