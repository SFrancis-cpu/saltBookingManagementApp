package com.saltsoftware.repository.payment;

import com.saltsoftware.entity.payment.PatientPaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by :Heinrich Arends
 * Student no: 217166792
 * Desc: Create Patient Payment Type Repository Interface
 */

@Repository
public interface PatientPaymentTypeRepository extends JpaRepository<PatientPaymentType, String>{

}
