package edu.icet.servise;

import edu.icet.model.Patient;

import java.util.List;

public interface PatientServise {
    public List<Patient> getPatient();

    void addPatient(Patient patient);

    void deleteById(Integer id);

    List<Patient> searchByName(String name);

    List<Patient> searchByGender(String gender);

    List<Patient> searchByAddress(String address);

    List<Patient> searchByBloodGroup(String bloodGroup);

    List<Patient> searchByCategory(String category);

    List<Patient> searchByNic(String nic);

    List<Patient> searchByContact(String contact);
}
