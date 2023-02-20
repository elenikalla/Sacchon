package pfizer.bootcamp.group5.Sacchon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfizer.bootcamp.group5.Sacchon.model.Consultation;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {

}
