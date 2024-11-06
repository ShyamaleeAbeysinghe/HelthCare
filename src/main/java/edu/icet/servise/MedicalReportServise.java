package edu.icet.servise;

import edu.icet.model.MedicalReport;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MedicalReportServise {
    void addMedicalReport(MedicalReport medicalReport);

    Boolean deleteById(Integer id);

    List<MedicalReport> getAll();

    List<MedicalReport> searchByCategory(String category);

    List<MedicalReport> searchByLabNumber(Integer labNumber);
}
