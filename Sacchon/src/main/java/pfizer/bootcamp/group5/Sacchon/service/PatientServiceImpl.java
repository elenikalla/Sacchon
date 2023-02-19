package pfizer.bootcamp.group5.Sacchon.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pfizer.bootcamp.group5.Sacchon.dto.PatientDto;
import pfizer.bootcamp.group5.Sacchon.exception.PatientException;
import pfizer.bootcamp.group5.Sacchon.model.Patient;
import pfizer.bootcamp.group5.Sacchon.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;


    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        //check id-->username-->unique?
        Patient patient = patientDto.asPatient();
        return new PatientDto(patientRepository.save(patient));
    }
    @Override
    public List<PatientDto> readPatient() {
        return null;
    }

//    @Override
//    public List<PatientDto> readPatient() {
//
//        return patientRepository
//                .findAll()
//                .stream()
//                .map(PatientDto::new)
//                .collect(Collectors.toList());
//    }

    @Override
    public PatientDto readPatient(int id) throws PatientException {
        return new PatientDto(readPatientData(id));
    }
    private PatientDto readPatientData(int id) throws PatientException {
        Optional<Patient> patientOptional = patientRepository.findById(id);
        if (patientOptional.isPresent())
            return new PatientDto(patientOptional.get().getUsername(),patientOptional.get().getAmkaCode(),patientOptional.get().getFirstName(),patientOptional.get().getLastName());
        ;
        throw new PatientException("Patient not found "+ id);
    }
}
