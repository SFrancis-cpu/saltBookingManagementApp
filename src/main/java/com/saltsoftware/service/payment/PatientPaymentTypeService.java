package com.saltsoftware.service.payment;

import com.saltsoftware.service.IService;
import com.saltsoftware.entity.payment.PatientPaymentType;

import java.util.Set;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Service Interface
 */

public interface PatientPaymentTypeService extends IService<PatientPaymentType, String> {
    Set<PatientPaymentType> getAll();
}
