package com.saltsoftware.controller.patient;

/* author: Bathi Ntshinga
 * std no:214198227
 * Date: 10/11/2020
 * Description: Test Case for Application Security
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

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class PatientControllerTest {

    private static Patient patient = PatientFactory.createPatient("Bathi","Ntshinga");
    private static String SECURITY_USERNAME = "sma";
    private static String SECURITY_PASSWORD = "password";

    @Autowired
    private TestRestTemplate restTemplate = null;
    private String baseURL = "http://localhost:8080/patient/";

    //Testing the creation of patientName for application security

    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL:"+url);
        System.out.println("Post data "+ patient);
        ResponseEntity<Patient> postResponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .postForEntity(url,patient,Patient.class);
        assertNotNull(postResponse);
        Assert.assertEquals(patient.getPatientID(),postResponse.getBody().getPatientName(), postResponse.getBody().getPatientSurname());
        patient = postResponse.getBody();
        System.out.println("Saved data: "+patient);
        System.out.println(postResponse);
    }
    // Test the read command for application security
    @Test
    public void b_read() {
        String url = baseURL + "read/"+ patient.getPatientID();
        System.out.println("URL "+ url);
        System.out.println("from read:  "+patient);
        System.out.println(url);
        restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .getRestTemplate()
                .getForObject(url +"/patient/read",Patient.class);
        System.out.println("from read response: "+ patient);
        System.out.println(patient.getPatientName());
        assertNotNull(patient);
    }
    //Test the read command for application security
    @Test
    public void c_update() {
        System.out.println("from pre updated : "+patient.getPatientName()+" "+patient.getPatientName()+" "+ patient.getPatientID());
        Patient updated = new
                Patient.Builder().copy(patient).setPatientSurname("Bathi").build();
        String url = baseURL + "update";
        // System.out.println("from updated: "+updated);
        System.out.println("url "+ url);

        patient = updated;
        ResponseEntity<Patient> response =
                restTemplate
                        .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .postForEntity(url,updated,Patient.class);
        assertNotEquals(updated.getPatientSurname(),response.getBody().getPatientSurname());

        System.out.println("from post updated : "+ patient.getPatientName()+" "+patient.getPatientSurname()+" "+ patient.getPatientID());

    }

    @Test
    public void d_getAll() {
        String url = baseURL + "all";
        System.out.println("Get all" + patient);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity <String> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET,entity, String.class );
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);

    }

    //Testing the delete method in application security
    @Test
    public void e_delete() {
        String url = baseURL + "/delete/" + patient.getPatientID();
        System.out.println("URL: "+ url);
        restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .delete(url);
        System.out.println("after delete: "+patient);

    }

}