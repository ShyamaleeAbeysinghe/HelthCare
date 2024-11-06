package edu.icet.reporsitory;

import edu.icet.entity.AppoinmentEntity;
import edu.icet.model.Appoinment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppoinmentReporsitory extends JpaRepository<AppoinmentEntity,Integer> {
    List<AppoinmentEntity> findByAdminId(Integer adminId);

    List<AppoinmentEntity> findByPatientId(Integer patientId);

    List<AppoinmentEntity> findByType(String type);
}
