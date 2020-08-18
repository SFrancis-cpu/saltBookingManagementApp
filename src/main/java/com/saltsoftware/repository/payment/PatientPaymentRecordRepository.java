package com.saltsoftware.repository.payment;

import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.repository.Repository;
import java.util.Set;

/**
 * @author name: Linton Appollis
 *student num: 216182484
 *Desc: Repository Service for PatientPaymentRecord
 *date: August 2020
 * */

public interface PatientPaymentRecordRepository extends Repository<PatientPaymentRecord, String> {
    Set<PatientPaymentRecord>getAll();
}

