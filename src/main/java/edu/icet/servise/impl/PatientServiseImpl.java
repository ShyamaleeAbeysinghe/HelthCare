package edu.icet.servise.impl;

import edu.icet.entity.PatientEntity;
import edu.icet.model.Patient;
import edu.icet.reporsitory.PatientReporsitory;
import edu.icet.servise.PatientServise;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiseImpl implements PatientServise {

    final PatientReporsitory reporsitory;
    final ModelMapper mapper;

    @Override
    public List<Patient> getPatient() {
        List<Patient> patients=new ArrayList<>();
        reporsitory.findAll().forEach(patient->{
           patients.add(mapper.map(patient,Patient.class));
        });
        return patients;
    }

    @Override
    public void addPatient(Patient patient) {
        reporsitory.save(mapper.map(patient, PatientEntity.class));
    }
    @Override
    public void deleteById(Integer id) {
        reporsitory.deleteById(id);
    }
    @Override
    public List<Patient> searchByName(String name) {
        List<Patient> patientList=new ArrayList<>();
         reporsitory.findByName(name).forEach(patientEntity -> {
             patientList.add(mapper.map(patientEntity,Patient.class));
         });
         return patientList;
    }
    @Override
    public List<Patient> searchByGender(String gender) {
        List<Patient> patientList=new ArrayList<>();
        reporsitory.findByGender(gender).forEach(patientEntity -> {
            patientList.add(mapper.map(patientEntity,Patient.class));
        });
        return patientList;
    }
    @Override
    public List<Patient> searchByAddress(String address) {
        List<Patient> patientList=new ArrayList<>();
        reporsitory.findByAddress(address).forEach(patientEntity -> {
            patientList.add(mapper.map(patientEntity,Patient.class));
        });
        return patientList;
    }
    @Override
    public List<Patient> searchByBloodGroup(String bloodGroup) {
        List<Patient> patientList=new ArrayList<>();
        reporsitory.findByBloodGroup(bloodGroup).forEach(patientEntity -> {
            patientList.add(mapper.map(patientEntity,Patient.class));
        });
        return patientList;
    }
    @Override
    public List<Patient> searchByCategory(String category) {
        List<Patient> patientList=new ArrayList<>();
        reporsitory.findByCategory(category).forEach(patientEntity -> {
            patientList.add(mapper.map(patientEntity,Patient.class));
        });
        return patientList;
    }
    @Override
    public List<Patient> searchByNic(String nic) {
        List<Patient> patientList=new ArrayList<>();
        reporsitory.findByNic(nic).forEach(patientEntity -> {
            patientList.add(mapper.map(patientEntity,Patient.class));
        });
        return patientList;
    }
    @Override
    public List<Patient> searchByContact(String contact) {
        List<Patient> patientList=new ArrayList<>();
        reporsitory.findByContact(contact).forEach(patientEntity -> {
            patientList.add(mapper.map(patientEntity,Patient.class));
        });
        return patientList;
    }
}
