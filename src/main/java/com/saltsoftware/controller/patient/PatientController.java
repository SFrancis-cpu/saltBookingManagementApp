package com.saltsoftware.controller.patient;
import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.factory.patient.PatientFactory;
import com.saltsoftware.service.patient.impl.PatientServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
/* author: Bathi Ntshinga
/* std no:214198227
/* Description: Adding Annotations
 */

@RestController
@RequestMapping("sma/patient")
public class PatientController {

    @Autowired
    private PatientServiceImpl PatientService;

    @PostMapping("/create")
    @ResponseBody
    public Patient create(@RequestBody Patient patient){
        patient = PatientFactory.createPatient(patient.getPatientName(), patient.getPatientSurname());
        return PatientService.create(patient);
    }
    /*to get all*/
    @GetMapping("/all")
    public Set<Patient> getAll(){
        return PatientService.getAll();
    }

    /*to update*/
    @PostMapping("/update")
    @ResponseBody
    public Patient update(@RequestBody Patient patient){

        return PatientService.update(patient);
    }

    /*to delete*/
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public boolean delete(@PathVariable String id){
        return PatientService.delete(id);
    }

}