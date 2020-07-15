package com.saltsoftware.factory;

/*
 * @author name: Linton Appollis
 *student num: 216182484
 *Desc: creating a PatientPaymentRecord Factory
 *date: 11 July 2020
 */

import com.saltsoftware.util.GenericHelper;
import com.saltsoftware.entity.PatientPaymentRecord;

public class PatientPaymentRecordFactory
{

    public static PatientPaymentRecord createPatientPaymentRecord(String payReceiptNumber, String payDate, String payAmount)
    {
        // Utility (functional to be reused)  - generate a Receipt Number
        // Check receipt number, pay date and amount paid
        String ReceiptNumber = GenericHelper.generateReceiptNumber();
        // logic around the requirements for a payment record, implement business rule - payment record, must have the below.
        return new PatientPaymentRecord.Builder()
                .setpayReceiptNumber(payReceiptNumber)
                .setpayDate(payDate)
                .setpayAmount(payAmount)
                .build();
    }


}
