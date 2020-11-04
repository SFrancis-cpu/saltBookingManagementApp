package com.saltsoftware.repository.patient;
import com.saltsoftware.entity.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/* author: Bathi Ntshinga
/* std no:214198227
/*Description: Create Payment interface to get all patient methods
/*Date: 2020/12/03
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {
    Set<Patient>getAll();
}
