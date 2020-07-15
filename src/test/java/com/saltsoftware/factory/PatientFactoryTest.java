/*   @Author: Bathi Ntshinga
 *   StudentNumber : 214198227
 *   Description: Test case for PatientFactory
 * Date: 13/07/2020
 * */

package com.saltsoftware.factory;
import com.saltsoftware.entity.Patient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientFactoryTest {

    @Before
    public void createPatient() {
        Patient patient1 = PatientFactory.createPatient("Bathi", "Ntshinga");
        assertSame(patient1.getPatientID(), patient1.getPatientSurname());
    }

   @Test
   /*Testing two objects for identity and equality patient1 and patient2*/
   public void testCreatePatient() {
       Patient patient1 = PatientFactory.createPatient("Bathi","Ntshinga");
       Patient patient2 = PatientFactory.createPatient("Noluthando","Nqwelo");

       assertSame(patient1.getPatientName(),patient2.getPatientName());

       assertEquals(patient1.getPatientID(),patient2.getPatientID());
   }
    /*Test identity on patient Surname*/
    @Test
    public void testIdentity(){

        Patient patient1 = PatientFactory.createPatient("Bathi","Ntshinga");
        Patient patient2 = PatientFactory.createPatient("Noluthando","Nqwelo");

        assertSame(patient1.getPatientSurname(), patient2.getPatientSurname());
        assertEquals(patient1.getPatientSurname(), patient2.getPatientSurname());
    }



}