package pfizer.bootcamp.group5.Sacchon.service;


import pfizer.bootcamp.group5.Sacchon.dto.PatientDto;
import pfizer.bootcamp.group5.Sacchon.exception.PatientException;

import java.util.List;

public interface PatientService{
    PatientDto createPatient(PatientDto patient);
    PatientDto readPatient(int id) throws PatientException;
    List<PatientDto> readPatient();
}
