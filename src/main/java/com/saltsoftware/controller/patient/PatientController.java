package com.saltsoftware.controller.patient;
import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.factory.patient.PatientFactory;
import com.saltsoftware.service.patient.impl.PatientServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
/* author: Bathi Ntshinga
/* std no:214198227
/* Description: Creating the Patient Controller
 */

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientServiceImpl PatientService;

    @PostMapping("/create")
    public Patient create(@RequestBody Patient patient){
        Patient newPatient = PatientFactory.createPatient(patient.getPatientID());
        return PatientService.create(newPatient);
    }
    /*to get all*/
    @GetMapping("/all")
    public Set<Patient> getall(){
        return PatientService.getAll();
    }

    /*to update*/
    @PostMapping("/update")
    public Patient update(@RequestBody Patient patient){
        return PatientService.update(patient);
    }

    /*to delete*/
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        PatientService.delete(id);
    }

}
