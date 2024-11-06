package edu.icet.servise;

import edu.icet.entity.AppoinmentEntity;
import edu.icet.model.Appoinment;
import edu.icet.reporsitory.AppoinmentReporsitory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppoinmentService  {
    void addAppoinment(Appoinment appoinment);

    Boolean deleteById(Integer id);

    List<Appoinment> getAll();

    Appoinment getAppoinmentById(Integer id);

    List<Appoinment> getAppoinmentByAdminId(Integer adminId);

    List<Appoinment> getAppoinmentByPatientId(Integer patientId);

    List<Appoinment> getAppoinmentByType(String type);
}
