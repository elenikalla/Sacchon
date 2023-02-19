package pfizer.bootcamp.group5.Sacchon.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pfizer.bootcamp.group5.Sacchon.dto.BGL_Dto;
import pfizer.bootcamp.group5.Sacchon.dto.DCI_Dto;
import pfizer.bootcamp.group5.Sacchon.exception.MyException;
import pfizer.bootcamp.group5.Sacchon.model.BloodGlucoseLevel;
import pfizer.bootcamp.group5.Sacchon.model.DailyCarbonatesIntake;
import pfizer.bootcamp.group5.Sacchon.repository.BGLRepository;
import pfizer.bootcamp.group5.Sacchon.repository.DCIRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class MediDataVaultServicesImpl {
    private final BGLRepository BGLRepository;
    private final DCIRepository DCIRepository;


    public BGL_Dto createBGL(BGL_Dto bgl_dto) {
        BloodGlucoseLevel bloodGlucoseLevel = bgl_dto.asBGL();
        return new BGL_Dto(BGLRepository.save(bloodGlucoseLevel)) ;
    }

    public List<BGL_Dto> readBGL() {
        return null;
    }

    public BGL_Dto readBGL(int id) throws MyException {
        return null;
    }

    public boolean updateBGL(BGL_Dto bgl, int id) {
        return false;
    }

    public DCI_Dto createDCI(DCI_Dto dci_dto) {
        DailyCarbonatesIntake dailyCarbonatesIntake = dci_dto.asDCI();
        return new DCI_Dto(DCIRepository.save(dailyCarbonatesIntake)) ;
    }

    public List<DCI_Dto> readDCI() {
        return null;
    }

    public DCI_Dto readDCI(int id) throws MyException {
        return null;
    }

    public boolean updateDCI(DCI_Dto dci_dto, int id) {
        return false;
    }
}
