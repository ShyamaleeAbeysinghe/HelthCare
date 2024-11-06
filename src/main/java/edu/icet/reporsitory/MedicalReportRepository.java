package edu.icet.reporsitory;

import edu.icet.entity.MedicalReportEntity;
import edu.icet.model.MedicalReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicalReportRepository extends JpaRepository<MedicalReportEntity,Integer> {
    List<MedicalReportEntity> findByCategory(String category);


    List<MedicalReportEntity> findByLabNumber(Integer labNumber);
}
