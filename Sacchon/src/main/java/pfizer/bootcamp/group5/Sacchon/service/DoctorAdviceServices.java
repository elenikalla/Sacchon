package pfizer.bootcamp.group5.Sacchon.service;

import pfizer.bootcamp.group5.Sacchon.dto.ConsultationDto;
import pfizer.bootcamp.group5.Sacchon.exception.MyException;

import java.util.List;

public interface DoctorAdviceServices {

    // Consultation  CRU

    ConsultationDto createConsultation(ConsultationDto consultation);
    List<ConsultationDto> readConsultation();
    ConsultationDto readConsultation(int id) throws MyException;
    boolean updateConsultation(ConsultationDto consultation, int id);
    String ping();

}
