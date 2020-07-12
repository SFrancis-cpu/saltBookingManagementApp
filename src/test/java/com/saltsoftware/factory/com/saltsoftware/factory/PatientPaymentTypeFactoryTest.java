package com.saltsoftware.factory;

import com.saltsoftware.entity.PatientPaymentType;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientPaymentTypeFactoryTest {

    @Test
    public void createPatientPaymentType() {
        PatientPaymentType obj = PatientPaymentTypeFactory.createPatientPaymentType("Credit Card");
        assertEquals(obj.getPaymentDescrip(), "Credit Card");

    }
}