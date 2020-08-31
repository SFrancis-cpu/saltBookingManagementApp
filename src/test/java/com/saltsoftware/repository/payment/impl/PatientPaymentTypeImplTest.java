package com.saltsoftware.repository.payment.impl;

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.factory.payment.PatientPaymentTypeFactory;
import com.saltsoftware.repository.payment.PatientPaymentTypeRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Unit testing
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatientPaymentTypeImplTest {

    private static PatientPaymentTypeRepository Repository = new PatientPaymentTypeImpl();
    private static PatientPaymentType patientPaymentType = PatientPaymentTypeFactory.createPaymentType("Debit Card");

    //Test case for create method
    @Test
    public void a_testCreate() {
        PatientPaymentType created = Repository.create(patientPaymentType);
        Assert.assertEquals(patientPaymentType.getPaymentTypeID(), created.getPaymentTypeID());
        System.out.println("created: " + created);
    }

    //Test case for read method
    @Test
    public void b_testRead() {
        PatientPaymentType read = Repository.read(patientPaymentType.getPaymentTypeID());
        Assert.assertEquals(patientPaymentType.getPaymentTypeID(), read.getPaymentTypeID());
        System.out.println("Read: " + read);
    }

    //Test case for update method
    @Test
    public void c_testUpdate() {
        PatientPaymentType update = new PatientPaymentType.Builder().copy(patientPaymentType).setDescrip("Credit Card").build();
        Repository.update(update);
        assertNotEquals(patientPaymentType.getPaymentDescrip(), update.getPaymentDescrip());
        System.out.println("Update: " + update);
    }

    //Test case for delete method
    @Test
    public void e_testDelete() {
        Repository.delete(patientPaymentType.getPaymentTypeID());
    }

    //Test case for getAll method
    @Test
    public void d_testGetAll() {
        Set<PatientPaymentType> patientPaymentType = Repository.getAll();
        assertEquals(1, patientPaymentType.size());
        System.out.println(Repository.getAll());
    }
}
