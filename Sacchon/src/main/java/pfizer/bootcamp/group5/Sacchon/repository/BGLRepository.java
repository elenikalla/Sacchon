package pfizer.bootcamp.group5.Sacchon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfizer.bootcamp.group5.Sacchon.model.BloodGlucoseLevel;

public interface BGLRepository extends JpaRepository<BloodGlucoseLevel,Integer> {

}
