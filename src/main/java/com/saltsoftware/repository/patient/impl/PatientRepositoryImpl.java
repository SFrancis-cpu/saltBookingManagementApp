package com.saltsoftware.repository.patient.impl;
import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.repository.patient.PatientRepository;
import java.util.HashSet;
import java.util.Set;

/*author: Bathi Ntshinga
 *Std no:214198227
 *Description: Creating the Patient methods that implements Patient repository
 *Date: 2020/09/01
*/


public class PatientRepositoryImpl implements PatientRepository {


    private Set<Patient>PatientDB;
    public static PatientRepository patientRepository = null;

    public PatientRepositoryImpl(){
        this.PatientDB = new HashSet<>();
    }

    public static PatientRepository getPatientRepository(){
        if(patientRepository == null)
            patientRepository = new PatientRepositoryImpl();
        return patientRepository;
    }

    // At this method will be used to create patient
    @Override
    public Patient create(Patient patient) {
        this.PatientDB.add(patient);
        return patient;
    }
    /*This method is used to read the patientID*/
    @Override
    public Patient read(String patientId) {
        Patient patient = null;
        for(Patient p : this.PatientDB){
            if(p.getPatientID().equalsIgnoreCase(patientId)){
                patient = p;
                break;
            }
        }
        return patient;
    }

    /* Updating and adding existing Patient details */
    public Patient update(Patient patient) {
        Patient existingPatient = read(patient.getPatientID());
        if(existingPatient != null){
            this.PatientDB.remove(existingPatient);
            this.PatientDB.add(patient);
        }
        return patient;
    }

    /*This method reads deletes and removes patient*/

    public boolean delete(String patientID) {
        Patient patient = read(patientID);
        if(patientID != null);
        this.PatientDB.remove(patient);

        return false;
    }
    // retrieves all the objects from the database
    @Override
    public Set<Patient> getAll() {
        return this.PatientDB;
    }
}