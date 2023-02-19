package pfizer.bootcamp.group5.Sacchon.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pfizer.bootcamp.group5.Sacchon.dto.PatientDto;
import pfizer.bootcamp.group5.Sacchon.exception.PatientException;
import pfizer.bootcamp.group5.Sacchon.model.Patient;
import pfizer.bootcamp.group5.Sacchon.service.PatientService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class PatientController {
    private PatientService patientService;


//            @GetMapping("/patient")
//        public List<PatientDto> readPatient(){
//            return patientService.readPatient();
//        }
    @PostMapping("/patient")
    public PatientDto createPatient(@RequestBody PatientDto patientDto){
        log.info("The patient was created");
        return patientService.createPatient(patientDto);
    }
    @GetMapping("/patient/{id}")
    public PatientDto readPatientDto(@PathVariable(name = "id") int id) throws PatientException{
        log.info("Request a patient/endpoint");
        try {
            return patientService.readPatient(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
