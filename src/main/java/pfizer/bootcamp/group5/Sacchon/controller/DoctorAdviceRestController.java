package pfizer.bootcamp.group5.Sacchon.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pfizer.bootcamp.group5.Sacchon.dto.ConsultationDto;
import pfizer.bootcamp.group5.Sacchon.exception.MyException;
import pfizer.bootcamp.group5.Sacchon.service.DoctorAdviceServices;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class DoctorAdviceRestController {
    private DoctorAdviceServices doctorAdviceServices ;

    @GetMapping("/ping")
    public String ping(){
        log.info("The end point ping has been used");
        return doctorAdviceServices.ping();
    }



    @GetMapping("/Consultation")
    public List<ConsultationDto> getConsultationDto(){
        //log.info("The end point ConsultationDto has been used");
        return doctorAdviceServices.readConsultation();
    }

    @GetMapping("/Consultation/{id}")
    public ConsultationDto getConsultationDto(@PathVariable(name="id") int id) throws MyException {
        //log.info("The end point ConsultationDto has been used");
        return doctorAdviceServices.readConsultation(id);
    }

    @PostMapping("/Consultation")
    public  ConsultationDto createConsultationDto(@RequestBody ConsultationDto consultationDto){
        //log.info("The end point product has been used");
        return doctorAdviceServices.createConsultation(consultationDto);
    }

    @PutMapping("/Consultation/{id}")
    public boolean updateConsultationDto(@RequestBody ConsultationDto consultationDto,
                                         @PathVariable(name="id") int id)
    {
        if (doctorAdviceServices.updateConsultation(consultationDto, id))
        {
            //call service from medidatavaultServices to warn patient that a change in [id] consultation has occured
        }
        return doctorAdviceServices.updateConsultation(consultationDto, id);
    }
}
