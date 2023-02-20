package pfizer.bootcamp.group5.Sacchon.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pfizer.bootcamp.group5.Sacchon.model.ChiefDoctor;
import pfizer.bootcamp.group5.Sacchon.model.Doctor;
import pfizer.bootcamp.group5.Sacchon.repository.ChiefDoctorRepository;
import pfizer.bootcamp.group5.Sacchon.repository.DoctorRepository;

import java.util.List;

@Configuration
public class InitialConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(
            DoctorRepository docRepository, ChiefDoctorRepository chiefDocRepository){
        return args -> {
            Doctor doctor1 = new Doctor( 0, "giorgos@gmail.com", "giorgosantoniou","Giorgos", "Antoniou");
            Doctor doctor2 = new Doctor( 0, "kostas@gmail.com", "kostasparaskevas", "Kostas", "Paraskevas");
            docRepository.saveAll(List.of(doctor1, doctor2));
            ChiefDoctor chiefdoctor1 = new ChiefDoctor( 0, "mixalis@gmail.com", "mixaliskarageorgiou","Mixalis", "Karageorgiou");
            ChiefDoctor chiefdoctor2  = new ChiefDoctor( 0, "nikos@gmail.com", "nikospantiris","Nikos", "Pantiris");
            chiefDocRepository.saveAll(  List.of(chiefdoctor1, chiefdoctor2)   );

        };
    }

}
