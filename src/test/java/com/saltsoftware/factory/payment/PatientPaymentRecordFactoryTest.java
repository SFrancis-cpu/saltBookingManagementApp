package com.saltsoftware.factory.payment;
import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.factory.payment.PatientPaymentRecordFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * @author name: Linton Appollis
 * student num: 216182484
 * Desc: creating a Test Case for Patient Payment Record
 * date: 12 July 2020
 **/

public class PatientPaymentRecordFactoryTest {

    @Before
    public void setUp()
    {
        PatientPaymentRecord p = PatientPaymentRecordFactory.createPatientPaymentRecord("001", "30 July", "ZAR 500");
    }

    //Test for object Identity and Equality
    @Test
    public void createPatientPaymentRecord()
    {
        PatientPaymentRecord p = PatientPaymentRecordFactory.createPatientPaymentRecord("001", "30 July", "ZAR 500");
        PatientPaymentRecord p2 = PatientPaymentRecordFactory.createPatientPaymentRecord("022", "10 March", "ZAR 100");

        //Identity test
        Assert.assertSame(p.getPayReceiptNumber(), p.getPayReceiptNumber());
        Assert.assertSame(p.getPayDate(), p.getPayDate());
        Assert.assertSame(p.getPayAmount(), p.getPayAmount());

        //Equality test
        Assert.assertEquals(p.getPayReceiptNumber(), p2.getPayReceiptNumber());
        Assert.assertEquals(p.getPayDate(), p2.getPayDate());
        Assert.assertEquals(p.getPayAmount(), p2.getPayAmount());

    }

    @Test
    public void testPayReceiptNumber()
    {
        //A equality test for Pay Receipt Number
        PatientPaymentRecord p = PatientPaymentRecordFactory.createPatientPaymentRecord("001", "30 July", "ZAR 500");
        Assert.assertEquals("001", p.getPayReceiptNumber());
    }
    @Test
    public void testPayDate()
    {
        //A equality test for Pay Date
        PatientPaymentRecord p = PatientPaymentRecordFactory.createPatientPaymentRecord("001", "30 July", "ZAR 500");
        Assert.assertEquals("30 July", p.getPayDate());
    }
    @Test
    public void testPayAmount()
    {
        //A equality test for Pay Value
        PatientPaymentRecord p = PatientPaymentRecordFactory.createPatientPaymentRecord("001", "30 July", "ZAR 500");
        Assert.assertEquals("ZAR 500", p.getPayAmount());
    }


}