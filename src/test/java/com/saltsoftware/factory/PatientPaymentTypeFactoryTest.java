package com.saltsoftware.factory;

import com.saltsoftware.entity.PatientPaymentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientPaymentTypeFactoryTest {

    @Before
    public void testSetupPaymentType() {
        PatientPaymentType type = PatientPaymentTypeFactory.createPaymentType("Credit Card");
    }

    //Test for object Identity and Equality
    @Test
    public void testCreatePaymentType(){

        PatientPaymentType type1 = PatientPaymentTypeFactory.createPaymentType("Credit Card");
        PatientPaymentType type2 = PatientPaymentTypeFactory.createPaymentType("Debit Card");

        //Identity test
        assertSame(type1.getPaymentDescrip(), type1.getPaymentDescrip());

        //Equality test
        assertEquals(type1.getPaymentDescrip(), "Credit Card");
        assertEquals(type2.getPaymentDescrip(), "Debit Card");
        assertNotSame(type1.getPaymentDescrip(), type2.getPaymentDescrip());
    }
}
