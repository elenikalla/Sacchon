package pfizer.bootcamp.group5.Sacchon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pfizer.bootcamp.group5.Sacchon.model.DailyCarbonatesIntake;

public interface DCIRepository extends JpaRepository<DailyCarbonatesIntake,Integer> {
}
