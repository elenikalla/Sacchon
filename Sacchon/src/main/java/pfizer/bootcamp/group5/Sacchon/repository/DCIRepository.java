package pfizer.bootcamp.group5.Sacchon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfizer.bootcamp.group5.Sacchon.model.DailyCarbonatesIntake;
@Repository
public interface DCIRepository extends JpaRepository<DailyCarbonatesIntake,Integer> {
}
