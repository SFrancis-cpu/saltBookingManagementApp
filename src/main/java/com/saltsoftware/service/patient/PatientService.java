package com.saltsoftware.service.patient;

import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.service.IService;
import java.util.Set;
/*author: Bathi Ntshinga
 *Std no:214198227
 *Description: Creating unique business logic as required for patient
 *Date: 2020/09/08
 */

public interface PatientService extends IService<Patient, String> {
    Set<Patient>  getAll();

    //Unique business logic as required for Patient
}
