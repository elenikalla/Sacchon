package pfizer.bootcamp.group5.Sacchon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfizer.bootcamp.group5.Sacchon.model.BloodGlucoseLevel;
@Repository
public interface BGLRepository extends JpaRepository<BloodGlucoseLevel,Integer> {

}
