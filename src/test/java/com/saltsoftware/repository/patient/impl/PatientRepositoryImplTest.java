package com.saltsoftware.repository.patient.impl;

//import com.saltsoftware.entity.patient.Patient;
//import com.saltsoftware.factory.patient.PatientFactory;
//import com.saltsoftware.repository.patient.PatientRepository;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Set;
//import static org.junit.Assert.*;

/*author: Bathi Ntshinga
 *Std no:214198227
 *Description: Creating the Test Case for patient repository
 *Date: 2020/09/01
 */

//public class PatientRepositoryImplTest {

//    @Autowired
//    private static PatientRepository repository;
//    private Patient patient = PatientFactory.createPatient("Bathi","Ntshinga");

  /*Test case for the creation of the patient*/
//    @Test
//    public void create() {
//        Patient created = repository.update(patient);
//        assertEquals(patient.getPatientID(), created.getPatientID());
//        System.out.println(created);
//    }

   //*Test case to read the patientID*/
//    @Test
//    public void read() {
//        Patient read = repository.read(patient.getPatientID());
//        assertEquals(patient.getPatientID(), read.getPatientID());
//        System.out.println("read:" + read);
//    }

   /*Test to update the Patient Name and Patient Surname*/
//    @Test
//    public void update() {
//        Patient updated = new Patient.Builder().copy(patient).setPatientName("Bathi").build();
//        repository.update(updated);
//        assertNotEquals(patient.getPatientSurname(), updated.getPatientSurname());
//        System.out.println("updated:" + updated);
//    }
   /*Test to delete Patient*/
//    @Test
//    public void delete() {
//        repository.delete(patient.getPatientID());
//    }
   /*Test to test all patient methods*/
//    @Test
//    public void getAll() {
//        Set<Patient> patient= repository.getAll();
//        assertEquals(1,patient.size());
//        System.out.println(repository.getAll());
//    }
//}