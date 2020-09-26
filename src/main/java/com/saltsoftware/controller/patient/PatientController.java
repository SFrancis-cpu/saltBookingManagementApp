package com.saltsoftware.controller.patient;

import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.factory.patient.PatientFactory;
import com.saltsoftware.repository.patient.PatientRepository;
import com.saltsoftware.service.patient.PatientService;
import com.saltsoftware.service.patient.impl.PatientServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @PostMapping("/create")
    public Patient create(@RequestBody Patient patient){
        Patient newPatient = PatientFactory.buildPatient(patient.getPatientID());
        return patientService.create(newPatient);
    }

    @GetMapping("/all")
    public Set<Patient> getall(){
        return patientService.getAll();
    }

}
