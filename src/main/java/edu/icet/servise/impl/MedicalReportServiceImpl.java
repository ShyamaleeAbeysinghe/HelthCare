package edu.icet.servise.impl;

import edu.icet.entity.MedicalReportEntity;
import edu.icet.model.MedicalReport;
import edu.icet.reporsitory.MedicalReportRepository;
import edu.icet.servise.MedicalReportServise;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportServise {
    final MedicalReportRepository repository;
    final ModelMapper mapper;
    @Override
    public void addMedicalReport(MedicalReport medicalReport) {
        repository.save(mapper.map(medicalReport, MedicalReportEntity.class));

    }

    @Override
    public Boolean deleteById(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<MedicalReport> getAll() {
        List<MedicalReport> reportList=new ArrayList<>();
        repository.findAll().forEach(medicalReportEntity -> {
            reportList.add(mapper.map(medicalReportEntity,MedicalReport.class));
        });
        return reportList;
    }

    @Override
    public List<MedicalReport> searchByCategory(String category) {
       List<MedicalReport> medicalReportList=new ArrayList<>();
        repository.findByCategory(category).forEach(medicalReport -> {
            medicalReportList.add(mapper.map(medicalReport,MedicalReport.class));
        });
        return medicalReportList;
    }

    @Override
    public List<MedicalReport> searchByLabNumber(Integer labNumber) {
        List<MedicalReport> medicalReportList=new ArrayList<>();
        repository.findByLabNumber(labNumber).forEach(medicalReportEntity -> {
            medicalReportList.add(mapper.map(medicalReportEntity,MedicalReport.class));
        });
        return medicalReportList;
    }
}
