package com.saltsoftware.controller.payment;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.entity.payment.PatientPaymentType;
import com.saltsoftware.factory.payment.PatientPaymentTypeFactory;
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
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

//random port to avoid an already used port
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PatientPaymentTypeControllerTest {

    private PatientPaymentType paymentTypeService = PatientPaymentTypeFactory.createPaymentType("Debit Card");

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/paymenttype/";

    //Test case for create method
    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL: "+url);
        System.out.println("Post data: "+paymentTypeService);
        ResponseEntity<PatientPaymentType> postResponse = restTemplate.postForEntity(url, paymentTypeService,PatientPaymentType.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        paymentTypeService = postResponse.getBody();
        System.out.println("Saved data: "+paymentTypeService);
        System.out.println(postResponse);
        System.out.println(postResponse.getBody());
        assertEquals(paymentTypeService.getPaymentTypeID(), postResponse.getBody().getPaymentTypeID());
    }

    @Test
    public void b_read() {
        String url = baseURL + "read/"+ paymentTypeService.getPaymentTypeID();
        System.out.println("URL "+ url);
        ResponseEntity<PatientPaymentType> getResponse = restTemplate.getForEntity(url,PatientPaymentType.class);
        System.out.println("this is response--> "+getResponse);
        assertNotNull(getResponse);
        //Assert.assertEquals(paymentTypeService,getResponse.getBody().getPaymentTypeID());
    }

    //Test case for update method
    @Test
    public void c_update() {
        PatientPaymentType updated = new PatientPaymentType.Builder().copy(paymentTypeService).setDescrip("Credit Card").build();
        String url = baseURL + "update";
        System.out.println("url "+ url);
        ResponseEntity<PatientPaymentType> response = restTemplate.postForEntity(url,updated,PatientPaymentType.class);
        assertEquals(updated.getPaymentTypeID(), response.getBody().getPaymentTypeID());
    }

    //Test case for getAll method
    @Test
    public void d_getall() {
        String url = baseURL + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    //Test case for delete method
    @Test
    public void e_delete() {
        String url = baseURL + "delete/" + paymentTypeService.getPaymentTypeID();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);
    }
}