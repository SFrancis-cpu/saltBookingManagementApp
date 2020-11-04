package com.saltsoftware.service.payment.impl;

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.repository.payment.PatientPaymentTypeRepository;
import com.saltsoftware.service.payment.PatientPaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Service Implementation
 */

@Service
public class PatientPaymentTypeServiceImpl implements PatientPaymentTypeService {

    // Encapsulate PatientPayment Repository
    private static PatientPaymentTypeService patientPaymentTypeService = null;

    @Autowired
    private PatientPaymentTypeRepository repository;

    @Override
    public Set<PatientPaymentType> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public PatientPaymentType create(PatientPaymentType patientPaymentType) {
        return this.repository.save(patientPaymentType);
    }

    @Override
    public PatientPaymentType read(String s) {

        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public PatientPaymentType update(PatientPaymentType patientPaymentType) {
        return this.repository.save(patientPaymentType);
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if(this.repository.existsById(s)) return false;
        else return true;
    }
}
