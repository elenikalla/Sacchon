package pfizer.bootcamp.group5.Sacchon.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pfizer.bootcamp.group5.Sacchon.model.Patient;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter

public class PatientDto extends Patient {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int amkaCode;
    //private LocalDate dateOfBirth;
   public PatientDto(Patient patient){
       if (patient!=null){
           id = patient.getId();
           username = patient.getUsername();
           password = patient.getPassword();
           amkaCode = patient.getAmkaCode();
           firstName = patient.getFirstName();
           lastName = patient.getLastName();
           //dateOfBirth = patient.getDateOfBirth();
       }
   }
   public PatientDto (String username,int amkaCode,String firstName,String lastName){
       this.username = username;
       this.amkaCode = amkaCode;
       this.password = "*****";
       this.firstName = firstName;
       this.lastName = lastName;
   }
    public Patient asPatient(){
        Patient patient = new Patient();
        patient.setId(0);
        patient.setUsername(username); //need to check for unique userName;
        patient.setPassword(password);
        patient.setAmkaCode(amkaCode);
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        //patient.setDateOfBirth(LocalDate.parse(dateOfBirth));
        return patient;
    }

}
