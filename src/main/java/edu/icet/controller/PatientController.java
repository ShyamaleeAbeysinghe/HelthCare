package edu.icet.controller;

import edu.icet.model.Patient;
import edu.icet.servise.PatientServise;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {

   final PatientServise servise;

    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return servise.getPatient();
    }

    @PostMapping("/add-patient")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPatient(@RequestBody Patient patient){
        servise.addPatient(patient);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        servise.deleteById(id);
    }

    @PutMapping("/update-patient")
    @ResponseStatus(HttpStatus.OK)
    public void updatePatient(@RequestBody Patient patient) {
        servise.addPatient(patient);
    }

    @GetMapping("/search-by-name/{name}")
    public  List<Patient> searchByName(@PathVariable String name) {
        return servise.searchByName(name);
    }

    @GetMapping("/search-by-gender/{gender}")
    public  List<Patient> searchByGender(@PathVariable String gender){
        return servise.searchByGender(gender);
    }

    @GetMapping("/search-by-bloodGroup/{bloodGroup}")
    public  List<Patient> searchByBloodGroup(@PathVariable String bloodGroup){
        return servise.searchByBloodGroup(bloodGroup);
    }

    @GetMapping("/search-by-category/{category}")
    public  List<Patient> searchByCategory(@PathVariable String category){
        return servise.searchByCategory(category);
    }

    @GetMapping("/search-by-nic/{nic}")
    public  List<Patient> searchByNic(@PathVariable String nic){
        return servise.searchByNic(nic);
    }

    @GetMapping("/search-by-contact/{contact}")
    public  List<Patient> searchByContact(@PathVariable String contact){
        return servise.searchByContact(contact);
    }

    @GetMapping("/search-by-address/{address}")
    public  List<Patient> searchByAddress(@PathVariable String address){
        return servise.searchByAddress(address);
    }
}
