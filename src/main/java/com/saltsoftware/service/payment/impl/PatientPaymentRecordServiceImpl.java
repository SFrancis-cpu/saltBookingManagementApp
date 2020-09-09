package com.saltsoftware.service.payment.impl;


import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.repository.payment.PatientPaymentRecordRepository;
import com.saltsoftware.repository.payment.impl.PatientPaymentRecordImpl;
import com.saltsoftware.service.payment.PatientPaymentRecordService;

import java.util.Set;

/* @author: Linton Appollis
/* @student number - 216182848
/* @Description - Creating Patient Payment Record Service
 */

public class PatientPaymentRecordServiceImpl implements PatientPaymentRecordService {


    private static PatientPaymentRecordService service = null;
    private PatientPaymentRecordRepository repository;

    public PatientPaymentRecordServiceImpl  ()
    {
        this.repository = PatientPaymentRecordImpl.getPatientPaymentRecordRepository();
    }

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
        return this.repository.create(patientPaymentRecord);
    }
    // Read the record and return
    @Override
    public PatientPaymentRecord read(String s) {
        return this.repository.read(s);
    }
    // update a record
    @Override
    public PatientPaymentRecord update(PatientPaymentRecord patientPaymentRecord) {
        return this.repository.update(patientPaymentRecord);
    }
    // drop record from this table
    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
