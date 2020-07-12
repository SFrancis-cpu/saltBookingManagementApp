/* author: Bathi Ntshinga
/* std no: 214198227
/* Description: Entity for PatientFactory
 */

package com.saltsoftware.factory;
import com.saltsoftware.entity.Patient;
import com.saltsoftware.util.GenericHelper;


public class PatientFactory {

    public static Patient createPatient(String patientName, String patientSurname ){

            String patientID = GenericHelper.generateID();
            Patient patient = new Patient.Builder()
                    .setPatientID(patientID)
                    .setPatientName(patientName)
                    .build();

            return patient;

    }
}