package com.saltsoftware.service.payment.impl;

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.factory.payment.PatientPaymentTypeFactory;
import com.saltsoftware.service.payment.PatientPaymentTypeService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Service Type Unit testing
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatientPaymentTypeServiceImplTest {

    @Autowired
    private static PatientPaymentTypeService Service;
    private static PatientPaymentType patientPaymentType = PatientPaymentTypeFactory.createPaymentType("Debit Card");

    //Test case for getAll method
    @Test
    public void d_getAll() {
        Set<PatientPaymentType> patientPaymentType = Service.getAll();
        assertEquals(1, patientPaymentType.size());
        System.out.println("All payment types: " + patientPaymentType);
    }
    //Test case for create method
    @Test
    public void a_create() {
        PatientPaymentType created = Service.create(patientPaymentType);
        Assert.assertEquals(patientPaymentType.getPaymentTypeID(), created.getPaymentTypeID());
        System.out.println("created: " + created);
    }
    //Test case for read method
    @Test
    public void b_read() {
        PatientPaymentType read = Service.read(patientPaymentType.getPaymentTypeID());
        Assert.assertEquals(patientPaymentType.getPaymentTypeID(), read.getPaymentTypeID());
        System.out.println("Read: " + read);
    }
    //Test case for update method
    @Test
    public void c_update() {
        PatientPaymentType update = new PatientPaymentType.Builder().copy(patientPaymentType).setDescrip("Credit Card").build();
        Service.update(update);
        assertNotEquals(patientPaymentType.getPaymentDescrip(), update.getPaymentDescrip());
        System.out.println("Update: " + update);
    }
    //Test case for delete method
    @Test
    public void e_delete() {Service.delete(patientPaymentType.getPaymentTypeID());}
}