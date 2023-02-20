package pfizer.bootcamp.group5.Sacchon.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pfizer.bootcamp.group5.Sacchon.model.DailyCarbonatesIntake;
import pfizer.bootcamp.group5.Sacchon.model.Patient;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@NoArgsConstructor
public class DCI_Dto {
    private int id;
    private LocalDate date;
    private LocalTime time;
    private Double measurement;
    private Patient patient;


    public DCI_Dto(DailyCarbonatesIntake dailyCarbonatesIntake) {
        if (dailyCarbonatesIntake != null) {
            id = dailyCarbonatesIntake.getId();
            date = dailyCarbonatesIntake.getDate();
            time = dailyCarbonatesIntake.getTime();
            measurement = dailyCarbonatesIntake.getMeasurement();
            patient = dailyCarbonatesIntake.getPatient();
        }
    }

    public DailyCarbonatesIntake asDCI() {
        DailyCarbonatesIntake dailyCarbonatesIntake = new DailyCarbonatesIntake();
        dailyCarbonatesIntake.setId(id);
        dailyCarbonatesIntake.setDate(date);
        dailyCarbonatesIntake.setTime(time);
        dailyCarbonatesIntake.setMeasurement(measurement);
        dailyCarbonatesIntake.setPatient(patient);

        return dailyCarbonatesIntake;
    }
}
