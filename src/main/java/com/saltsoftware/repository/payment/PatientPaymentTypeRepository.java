package com.saltsoftware.repository.payment;

import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.repository.Repository;

import java.util.Set;

/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Repository Interface
 */

public interface PatientPaymentTypeRepository extends Repository<PatientPaymentType, String> {
    Set<PatientPaymentType> getAll();
}
