package pfizer.bootcamp.group5.Sacchon.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pfizer.bootcamp.group5.Sacchon.dto.ConsultationDto;
import pfizer.bootcamp.group5.Sacchon.exception.MyException;
import pfizer.bootcamp.group5.Sacchon.model.Consultation;
import pfizer.bootcamp.group5.Sacchon.repository.ConsultationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DoctorAdviceServicesImpl implements DoctorAdviceServices{



    private final ConsultationRepository consultationRepository;

    @Override
    public ConsultationDto createConsultation(ConsultationDto consultationDto) {
        //validation
        Consultation consultation = consultationDto.asConsultation();
        return new ConsultationDto(consultationRepository.save(consultation)) ;

    }

    @Override
    public List<ConsultationDto> readConsultation() {
        return null;
    }

    @Override
    public ConsultationDto readConsultation(int id) throws MyException {
        return null;
    }

    @Override
    public boolean updateConsultation(ConsultationDto consultation, int id) {
        return false;
    }

    @Override
    public String ping() {
        return null;
    }
}
