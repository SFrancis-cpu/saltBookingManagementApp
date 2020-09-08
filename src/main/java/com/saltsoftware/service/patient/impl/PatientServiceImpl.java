package com.saltsoftware.service.patient.impl;

import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.repository.patient.PatientRepository;
import com.saltsoftware.repository.patient.impl.PatientRepositoryImpl;
import com.saltsoftware.service.patient.PatientService;

import java.util.HashSet;
import java.util.Set;

/*author: Bathi Ntshinga
 *Std no:214198227
 *Date: 2020/09/08
 */

public class PatientServiceImpl implements PatientService {

    public static PatientService service = null;
    private PatientRepository repository;

    private PatientServiceImpl() {
        this.repository=PatientRepositoryImpl.getPatientRepository();
    }

    public static PatientService getService(){
        if(service == null) service = new PatientServiceImpl();
        return service;
    }

    @Override
    public Set<Patient> getAll() {
        return null;
    }

    @Override
    public Patient create(Patient patient) {
        return this.repository.create(patient);
    }

    @Override
    public Patient read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Patient update(Patient patient) {
        return this.repository.update(patient);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
