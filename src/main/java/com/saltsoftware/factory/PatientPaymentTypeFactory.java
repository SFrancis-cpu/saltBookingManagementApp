package com.saltsoftware.factory;

import com.saltsoftware.entity.PatientPaymentType;
import com.saltsoftware.util.GenericHelper;

public class PatientPaymentTypeFactory {

    public static PatientPaymentType createPaymentType(String paymentDescrip){
        String paymentTypeID = GenericHelper.generateID();
        PatientPaymentType type = new PatientPaymentType.Builder()
                .setPaymentID(paymentTypeID)
                .setPaymentDescrip(paymentDescrip)
                .build();
        return type;
    }
}
