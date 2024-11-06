package edu.icet.controller;

import edu.icet.model.Appoinment;
import edu.icet.servise.AppoinmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apponment")
@RequiredArgsConstructor
public class AppoinmentController {

    final AppoinmentService appoinmentService;
    @PostMapping("/add-appoinment")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAppoinment(@RequestBody Appoinment appoinment){
            appoinmentService.addAppoinment(appoinment);
    }
    @PutMapping ("/update-appoinment")
    @ResponseStatus(HttpStatus.OK)
    public void updateAppoinment(@RequestBody Appoinment appoinment){
        appoinmentService.addAppoinment(appoinment);
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/delete-by-id/{id}")
    public Boolean deleteById(@PathVariable Integer id){
        return appoinmentService.deleteById(id);
    }
    @GetMapping("/get-all")
    public List<Appoinment> getAllAppoinment(){
        return appoinmentService.getAll();
    }
    @GetMapping("/getAppoinment-by-id/{id}")
    public Appoinment getAppoinmentById(@PathVariable Integer id){
        return appoinmentService.getAppoinmentById(id);
    }
    @GetMapping("/getAppoinment-by-adminId/{adminId}")
    public List<Appoinment> getAppoinmentByAdminId(@PathVariable Integer adminId){
        return appoinmentService.getAppoinmentByAdminId(adminId);
    }
    @GetMapping("/getAppoinment-by-patientId/{patientId}")
    public List<Appoinment> getAppoinmentByPatientId(@PathVariable Integer patientId){
        return appoinmentService.getAppoinmentByPatientId(patientId);
    }
    @GetMapping("/getAppoinment-by-type/{type}")
    public List<Appoinment> getAppoinmentByType(@PathVariable String type){
        return appoinmentService.getAppoinmentByType(type);
    }


}
