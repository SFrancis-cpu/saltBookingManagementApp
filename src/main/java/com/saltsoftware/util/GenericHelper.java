package com.saltsoftware.util;

import java.util.UUID;
/*
 Author: Sakeena Francis
 Description: Create utility package that generates ID's
 Date: 11-Jul-2020
*/

import java.util.UUID;

public class GenericHelper {

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

    //Created for entity PatientPaymentRecord Factory, attribute receiptNumber
    public static String generateReceiptNumber(){
        return UUID.randomUUID().toString();
    }

}
