package com.saltsoftware.service.payment.impl;

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.repository.payment.PatientPaymentTypeRepository;
import com.saltsoftware.repository.payment.impl.PatientPaymentTypeImpl;
import com.saltsoftware.service.payment.PatientPaymentTypeService;
import org.springframework.stereotype.Service;


import java.util.Set;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Service Implementation
 */

@Service
public class PatientPaymentTypeServiceImpl implements PatientPaymentTypeService {

    // Encapsulate PatientPayment Repository
    private static PatientPaymentTypeService patientPaymentTypeService = null;


    private PatientPaymentTypeRepository repository;

    // Constructor
    private PatientPaymentTypeServiceImpl() {
        this.repository = PatientPaymentTypeImpl.getPatientPaymentTypeRepository();
    }

    // Apply Singleton pattern
    public static PatientPaymentTypeService getPatientPaymentTypeService() {
        if(patientPaymentTypeService == null) patientPaymentTypeService = new PatientPaymentTypeServiceImpl();
        return patientPaymentTypeService;
    }

    @Override
    public Set<PatientPaymentType> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PatientPaymentType create(PatientPaymentType patientPaymentType) {
        return this.repository.create(patientPaymentType);
    }

    @Override
    public PatientPaymentType read(String s) {
        return this.repository.read(s);
    }

    @Override
    public PatientPaymentType update(PatientPaymentType patientPaymentType) {
        return this.repository.update(patientPaymentType);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
