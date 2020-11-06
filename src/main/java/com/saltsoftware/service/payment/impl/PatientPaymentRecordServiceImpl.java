package com.saltsoftware.service.payment.impl;


import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.repository.payment.PatientPaymentRecordRepository;
import com.saltsoftware.service.payment.PatientPaymentRecordService;
import com.saltsoftware.service.payment.PatientPaymentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/* @author: Linton Appollis
/* @student number - 216182848
/* @Description - Creating Patient Payment Record Service
 */
@Service
public class PatientPaymentRecordServiceImpl implements PatientPaymentRecordService {


    private static PatientPaymentRecordService service = null;

    @Autowired
    private PatientPaymentRecordRepository repository;


    public static PatientPaymentRecordService getPatientPaymentRecord(){
        if (service == null) service = new com.saltsoftware.service.payment.impl.PatientPaymentRecordServiceImpl();
        return service;
    }

    //Get all patient payment records - TSQL, Select * from Table below name
    @Override
    public Set<PatientPaymentRecord> getAll() {
        return this.repository.getAll();
    }

    // Create new Patient Payment Record
    @Override
    public PatientPaymentRecord create(PatientPaymentRecord patientPaymentRecord) {
        return this.repository.save(patientPaymentRecord);
    }
    // Read the record and return
    @Override
    public PatientPaymentRecord read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }
    // update a record
    @Override
    public PatientPaymentRecord update(PatientPaymentRecord patientPaymentRecord) {
        return this.repository.save(patientPaymentRecord);
    }
    // drop record from this table
    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if(this.repository.existsById(s)) return false;
        else return true;
    }
}
