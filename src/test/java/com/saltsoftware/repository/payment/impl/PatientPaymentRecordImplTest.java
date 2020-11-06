/*
package com.saltsoftware.repository.payment.impl;

import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.factory.payment.PatientPaymentRecordFactory;
import com.saltsoftware.repository.payment.PatientPaymentRecordRepository;
import com.saltsoftware.repository.payment.impl.PatientPaymentRecordImpl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
*/
/**
 * @author name: Linton Appollis
 *student num: 216182484
 *Desc: Creating Test Class for PatientPaymentRecord, Repository
 *date: August 2020
 * *//*


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatientPaymentRecordImplTest 
{
    private static PatientPaymentRecordRepository rep1 = new PatientPaymentRecordImpl();
    private static PatientPaymentRecord patientPaymentRecord = PatientPaymentRecordFactory.createPatientPaymentRecord("1000001","20 Dec.", "ZAR 500");

    //Test case for create method
    @Test
    public void a_testCreate() {
        PatientPaymentRecord created = rep1.create(patientPaymentRecord);
        Assert.assertEquals(patientPaymentRecord.getPayReceiptNumber(), created.getPayReceiptNumber());
        System.out.println("created: "+ created);
    }

    //Test case for read method
    @Test
    public void b_testRead() {
        PatientPaymentRecord read = rep1.read(patientPaymentRecord.getPayReceiptNumber());
        Assert.assertEquals(patientPaymentRecord.getPayReceiptNumber(),read.getPayReceiptNumber());
        System.out.println("Read: " +read);
    }

    //Test case for update method (testing that the value for Pay Receipt Number is not equal to Object patientPaymentRecord)
    @Test
    public void c_testUpdate() {
        PatientPaymentRecord updated = new PatientPaymentRecord.Builder().copy(patientPaymentRecord).setpayReceiptNumber("11000001").build();
        rep1.update(updated);
        assertNotEquals(patientPaymentRecord.getPayReceiptNumber(), updated.getPayReceiptNumber());
        System.out.println("updated: " + updated);

    }

    //Test case for delete method
    @Test
    public void e_testDelete() {
        rep1.delete(patientPaymentRecord.getPayReceiptNumber());

    }

    //Test case for getAll method
    @Test
    public void d_testGetAll() {
        Set<PatientPaymentRecord> patientPaymentRecords = rep1.getAll();
        assertEquals(1,patientPaymentRecords.size());
        System.out.println(rep1.getAll());
    }
}*/
