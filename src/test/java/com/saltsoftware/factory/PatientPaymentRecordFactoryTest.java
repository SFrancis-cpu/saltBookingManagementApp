package com.saltsoftware.factory;

/**
 * @author name: Linton Appollis
 *student num: 216182484
 *Desc: creating a PatientPaymentRecord Test Case
 *date: 12 July 2020
 */

import com.saltsoftware.entity.PatientPaymentRecordFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientPaymentRecordFactoryTest
{
    @Test
    public void receiptTest()
    {
        String expectedRecieptNum = "001";
        assertEquals(expectedRecieptNum, PatientPaymentRecordFactory.getPayReceiptNumber());
    }
    @Test
    public void payDateTest()
    {
        String expectedPayDate = "20 July";
        assertEquals(expectedPayDate, PatientPaymentRecordFactory.getPayDate());
    }
    @Test
    public void payAmountTest()
    {
        String expectedPayAmount = "ZAR 500";
        assertEquals(expectedPayAmount, PatientPaymentRecordFactory.getPayAmount());
    }
    @Test
    public void createPatientPaymentRecord()
    {
        PatientPaymentRecordFactory patientPaymentRecordFactory = PatientPaymentRecordFactory.createEmployeeRole("001","20 July","ZAR 500");
        assertEquals(patientPaymentRecordFactory );
    }

}