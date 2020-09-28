package com.saltsoftware.controller.patient;
import com.saltsoftware.entity.patient.Patient;
import com.saltsoftware.factory.patient.PatientFactory;
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
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
@FixMethodOrder (MethodSorters.NAME_ASCENDING)

/* author: Bathi Ntshinga
/* std no:214198227
/* Description: Test Case for Domain Driven Patient Controller
 */


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class PatientControllerTest {

    private TestRestTemplate restTemplate;
    private static Patient patient = PatientFactory.createPatient("Bathi","Ntshinga");

    private String baseURL = "http://localhost:8080/patient/";

    //Testing the creation of patientName
    @Test
    public void a_create() {

        Patient patient = PatientFactory.createPatient("Bathi");
        String url = baseURL + "create";
        System.out.println(url);

        ResponseEntity<Patient> postResponse = restTemplate.postForEntity(url, patient, Patient.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        System.out.println(postResponse);
        System.out.println(postResponse.getBody());

    }
    // Test the read command
    @Test
    public void b_read() {
        String url = myURL + "read/"+ patient.getPatientName();
        System.out.println("URL "+ url);
        System.out.println(url);
        ResponseEntity<Patient> getResponse = restTemplate.getForEntity(url,Patient.class);
        System.out.println("this is response--> "+getResponse);
        assertNotNull(getResponse);
    }
    @Test
    public void c_update() {
        Patient updated = new Patient().Builder().copy(patient).setPatientName("Bathi").build();
        String url = myURL + "update";
        System.out.println("url "+ url);
        ResponseEntity<Patient> response = restTemplate.postForEntity(url,updated,Patient.class);
        System.out.println(response.getBody().getPatientSurname());
        assertEquals(updated.getPatientName(), response.getBody().getPatientSurname());
    }

    @Test
    public void d_getall() {
        String url = myURL + "all";
        System.out.println("URL "+ url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println(response.getBody());
        assertNotNull(response);
    }

    //Testing the delete method
    @Test
    public void e_delete() {
        String url = myURL +"delete/"+ patient.getPatientId();
        System.out.println("URL: "+url);
        restTemplate.delete(url);
    }
}