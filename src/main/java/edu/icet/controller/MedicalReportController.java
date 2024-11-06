package edu.icet.controller;

import edu.icet.model.Appoinment;
import edu.icet.model.MedicalReport;
import edu.icet.model.Patient;
import edu.icet.servise.MedicalReportServise;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medical-report")
@CrossOrigin
@RequiredArgsConstructor
public class MedicalReportController {
    final MedicalReportServise servise;
    @PostMapping("/add-report")
    public void addMedicalReport(@RequestBody MedicalReport medicalReport){
        servise.addMedicalReport(medicalReport);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/delete-by-id/{id}")
    public Boolean deleteById(@PathVariable Integer id){
        return servise.deleteById(id);
    }

    @GetMapping
    List<MedicalReport> getAllReports(){
        return servise.getAll();
    }
    @GetMapping("/search-by-category/{category}")
    public  List<MedicalReport> searchByCategory(@PathVariable String category) {
        return servise.searchByCategory(category);
    }
    @GetMapping("/search-by-labNumber/{labNumber}")
    public  List<MedicalReport> searchByLabNumber(@PathVariable Integer labNumber) {
        return servise.searchByLabNumber(labNumber);
    }

}
