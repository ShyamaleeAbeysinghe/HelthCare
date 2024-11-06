package edu.icet.reporsitory;

import edu.icet.entity.PatientEntity;
import edu.icet.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientReporsitory extends JpaRepository<PatientEntity,Integer> {
    List<PatientEntity> findByName(String name);

    List<PatientEntity> findByGender(String gender);

    List<PatientEntity> findByAddress(String address);

    List<PatientEntity> findByBloodGroup(String bloodGroup);

    List<PatientEntity> findByCategory(String category);

    List<PatientEntity> findByNic(String nic);

    List<PatientEntity> findByContact(String contact);
}
