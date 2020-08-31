package com.saltsoftware.repository.payment.impl;

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.repository.payment.PatientPaymentTypeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Repository Implementation
 */

public class PatientPaymentTypeImpl implements PatientPaymentTypeRepository {

    // Data Structure type Set, used to manipulate data in the Patient Payment Type DB
    private Set<PatientPaymentType> patientPaymentTypeDB;
    private static PatientPaymentTypeRepository patientPaymentTypeRepository = null;

    // Constructor
    private PatientPaymentTypeImpl() {
        this.patientPaymentTypeDB = new HashSet<>();
    }

    public static PatientPaymentTypeRepository getPatientPaymentTypeRepository() {
        if(patientPaymentTypeRepository == null) patientPaymentTypeRepository = new PatientPaymentTypeImpl();
        return patientPaymentTypeRepository;
    }

    // Create patient payment type
    @Override
    public PatientPaymentType create(PatientPaymentType patientPaymentType) {
        this.patientPaymentTypeDB.add(patientPaymentType);
        return patientPaymentType;
    }

    // Read from PaymentType Database
    @Override
    public PatientPaymentType read(String paymentTypeID) {
        PatientPaymentType patientPaymentType = null;
        for(PatientPaymentType p : this.patientPaymentTypeDB){
            if(p.getPaymentTypeID().equalsIgnoreCase(paymentTypeID)){
                patientPaymentType = p;
                break;
            }
        }
        return patientPaymentType;
    }

    // Update existing Patient Payment Type
    @Override
    public PatientPaymentType update(PatientPaymentType patientPaymentType) {
        PatientPaymentType oldPatientPaymentType = read(patientPaymentType.getPaymentTypeID());
        if(oldPatientPaymentType != null){
            this.patientPaymentTypeDB.remove(oldPatientPaymentType);
            this.patientPaymentTypeDB.add(patientPaymentType);
        }
        return patientPaymentType;
    }

    // Remove Patient Payment object from Database
    @Override
    public void delete(String paymentTypeID) {
        PatientPaymentType patientPaymentType = read(paymentTypeID);
        if(patientPaymentType != null);
        this.patientPaymentTypeDB.remove(patientPaymentType);
    }

    @Override
    public Set<PatientPaymentType> getAll() {
        return this.patientPaymentTypeDB;
    }
}
