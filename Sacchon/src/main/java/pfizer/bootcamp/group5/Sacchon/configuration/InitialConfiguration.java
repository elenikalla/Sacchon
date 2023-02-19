package pfizer.bootcamp.group5.Sacchon.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pfizer.bootcamp.group5.Sacchon.model.ChiefDoctor;
import pfizer.bootcamp.group5.Sacchon.model.Doctor;
import pfizer.bootcamp.group5.Sacchon.model.Patient;
import pfizer.bootcamp.group5.Sacchon.repository.ChiefDoctorRepository;
import pfizer.bootcamp.group5.Sacchon.repository.DoctorRepository;
import pfizer.bootcamp.group5.Sacchon.repository.PatientRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class InitialConfiguration {
    private final PatientRepository patientRepository;

    public InitialConfiguration(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(
            DoctorRepository docRepository, ChiefDoctorRepository chiefDocRepository, PatientRepository patientRepository){
        return args -> {
            Doctor doctor1 = new Doctor(0, "giorgos@gmail.com", "giorgosantoniou","Giorgos", "Antoniou",null);
            Doctor doctor2 = new Doctor( 0,"kostas@gmail.com", "kostasparaskevas", "Kostas", "Paraskevas",null);
            docRepository.saveAll(List.of(doctor1, doctor2));
            ChiefDoctor chiefdoctor1 = new ChiefDoctor( 0, "mixalis@gmail.com", "mixaliskarageorgiou","Mixalis", "Karageorgiou");
            ChiefDoctor chiefdoctor2  = new ChiefDoctor( 0, "nikos@gmail.com", "nikospantiris","Nikos", "Pantiris");
            chiefDocRepository.saveAll(  List.of(chiefdoctor1, chiefdoctor2)   );
//            Patient patient1 = new Patient(0,"Giorgos",1223, LocalDate.of(2014, 01, 20),false,null,null);
//            Patient patient2 = new Patient(0,"Kostas",121212,LocalDate.of(2014, 01, 20),false,null,null);
//            patientRepository.saveAll(List.of( patient1 ,patient2));
        };
    }

}
