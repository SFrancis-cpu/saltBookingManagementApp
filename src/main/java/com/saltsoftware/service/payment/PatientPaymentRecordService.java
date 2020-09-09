package com.saltsoftware.service.payment;

import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.service.IService;

import java.util.Set;

/* @author: Linton Appollis
/* @student number - 216182848
/* @Description - Creating Patient Payment Record Service
 */
public interface PatientPaymentRecordService extends IService<PatientPaymentRecord, String> {
    Set<PatientPaymentRecord> getAll();

}
