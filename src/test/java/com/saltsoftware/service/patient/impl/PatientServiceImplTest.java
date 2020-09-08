package com.saltsoftware.service.patient.impl;
/*author: Bathi Ntshinga
 *Std no:214198227
 *Description: Creating the Test Case for patient Service
 *Date: 2020/09/08
 */

import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.factory.patient.PatientFactory;
import com.saltsoftware.repository.patient.PatientRepository;
import com.saltsoftware.repository.patient.impl.PatientRepositoryImpl;
import com.saltsoftware.service.patient.PatientService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
/*author: Bathi Ntshinga
 *Std no:214198227
 *Description: Creating a test case for Patient Service
 *Date: 2020/09/08
 */
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatientServiceImplTest {

    private static PatientService service = PatientServiceImpl.getService();
    private Patient patient = PatientFactory.createPatient("Bathi","Ntshinga");

    @Test
    public void d_getAll() {
        Set<Patient> patients =service.getAll();
        assertEquals(1,patients.size());
        System.out.print("All patients:" + patients);
    }

    @Test
    public void a_create() {
        Patient created = service.create(patient);
        assertEquals(patient.getPatientID(), created.getPatientID());
        System.out.println("Created:" + created);
    }

    @Test
    public void b_read() {
        Patient read = service.read(patient.getPatientID());
        System.out.println("read:" + read);
    }

    @Test
    public void c_update() {
        Patient updated = new Patient.Builder().copy(patient).setPatientName("Bathi").build();
        updated = service.update(updated);
        System.out.println("Updated:" + updated);
    }

    @Test
    public void e_delete() {
        boolean deleted = service.delete(patient.getPatientID());
        Assert.assertTrue(deleted);
    }
}