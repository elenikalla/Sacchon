package pfizer.bootcamp.group5.Sacchon.service;

import pfizer.bootcamp.group5.Sacchon.dto.BGL_Dto;
import pfizer.bootcamp.group5.Sacchon.dto.ConsultationDto;
import pfizer.bootcamp.group5.Sacchon.dto.DCI_Dto;
import pfizer.bootcamp.group5.Sacchon.exception.MyException;
import pfizer.bootcamp.group5.Sacchon.model.BloodGlucoseLevel;

import java.util.List;

public interface MediDataVaultServices {
    BGL_Dto createBGL(BGL_Dto bgl);
    List<BGL_Dto> readBGL();
    BGL_Dto readBGL(int id) throws MyException;
    boolean updateBGL(BGL_Dto consultation, int id);

    BGL_Dto createDCI(DCI_Dto dci);
    List<DCI_Dto> readDCI();
    DCI_Dto readDCI(int id) throws MyException;
    boolean updateDCI(DCI_Dto dci_dto, int id);
}
