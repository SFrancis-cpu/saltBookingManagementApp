package com.saltsoftware.controller.patient;

/* author: Bathi Ntshinga
 * std no:214198227
 * Description: Test Case for Domain Driven Patient Controller
 */


import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.factory.patient.PatientFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class PatientControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private static Patient patient = PatientFactory.createPatient("Bathi","Ntshinga");

    private String baseURL = "http://localhost:8080/patient/";

    //Testing the creation of patientName
    @Test
    public void a_create() {

        String url = baseURL + "create";

        ResponseEntity<Patient> postResponse = restTemplate.postForEntity(url, patient, Patient.class);
        Assert.assertEquals(patient.getPatientID(),postResponse.getBody().getPatientID());
        System.out.println(postResponse.getBody());

    }
    // Test the read command
    @Test
    public void b_read() {
        String url = baseURL + "read/"+ patient.getPatientName();
        System.out.println("URL "+ url);
        System.out.println(url);
        ResponseEntity<Patient> getResponse = restTemplate.getForEntity(url,Patient.class);
        System.out.println("this is response--> "+getResponse);


    }
    @Test
    public void c_update() {
        Patient updated = new Patient.Builder().copy(patient).setPatientName("Bathi").build();
        String url = baseURL + "update";
        ResponseEntity<Patient> responseEntity = restTemplate.postForEntity(url, updated, Patient.class);
        assertNotNull(responseEntity);
        assertNotNull(updated);
        System.out.println("updated" + updated);
    }

    @Test
    public void d_getAll() {
        String url = baseURL + "all";
        System.out.println("Get all "+ patient);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);
    }

    //Testing the delete method
    @Test
    public void e_delete() {
        String url = baseURL +"delete/"+ patient.getPatientName();
        System.out.println("URL: "+url);
        restTemplate.delete(url);
    }
}