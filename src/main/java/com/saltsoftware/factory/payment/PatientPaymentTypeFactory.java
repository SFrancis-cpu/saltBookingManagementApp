package com.saltsoftware.factory.payment;

/*
 * Created by: Heinrich Arends
 * Student no: 217166792
 * Desc: Create PatientPaymentType Factory
 **/

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.util.GenericHelper;

public class PatientPaymentTypeFactory {

    public static PatientPaymentType createPaymentType(String paymentDescrip){

        //Generic helper utility to auto generate payment type id
        String paymentTypeID = GenericHelper.generateID();

        //Factory method to encapsulate and build objects
        PatientPaymentType type = new PatientPaymentType.Builder()
                .setPaymentID(paymentTypeID)
                .setDescrip(paymentDescrip)
                .build();
        return type;
    }
}
