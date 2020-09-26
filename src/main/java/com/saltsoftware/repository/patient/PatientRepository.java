package com.saltsoftware.repository.patient;
import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.repository.Repository;
import java.util.Set;

/* author: Bathi Ntshinga
/* std no:214198227
/*Description: Create Payment interface to get all patient methods
/*Date: 2020/09/01
 */

public interface PatientRepository extends Repository<Patient, String> {
    Set<Patient>getAll();
}
