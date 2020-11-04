package com.saltsoftware.service.patient.impl;

import com.saltsoftware.entity.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.saltsoftware.repository.patient.PatientRepository;
import com.saltsoftware.service.patient.PatientService;
import java.util.Set;
import java.util.stream.Collectors;

/*author: Bathi Ntshinga
 *Std no:214198227
 *Date: 2020/11/02
 * Desc:Implementation of Patient Service
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired

    private PatientRepository repository;

    @Override
    public Set<Patient> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Patient create(Patient patient) {
        return this.repository.save(patient);
    }

    @Override
    public Patient read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public Patient update(Patient patient) {
        return create(patient);
    }

    @Override
    public boolean delete(String s) {

        this.repository.deleteById(s);
        if (this.repository.existsById(s)) return false;
        return true;

    }
}
