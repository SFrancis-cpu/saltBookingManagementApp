package com.saltsoftware.repository.payment;

import com.saltsoftware.entity.payment.PatientPaymentRecord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author name: Linton Appollis
 *student num: 216182484
 *Desc: Repository Service for PatientPaymentRecord
 *date: August 2020
 */

@Repository
public interface PatientPaymentRecordRepository extends JpaRepository<PatientPaymentRecord, String> {

}

