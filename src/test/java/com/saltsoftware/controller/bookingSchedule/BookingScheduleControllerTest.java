package com.saltsoftware.controller.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: testing of BookingSchedule controller
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BookingScheduleControllerTest {

    private BookingSchedule bookingSchedule = BookingScheduleFactory.buildBookingSchedule("56865");

    @Autowired
    private TestRestTemplate restTemplate;
    private  String baseURL = "http://localhost:8080/bookingSchedule";

    @Test
    public void a_create() {

        String url = baseURL + "create";
        System.out.println("URL: "+url);
        System.out.println("Post data: "+bookingSchedule);
        ResponseEntity<BookingSchedule> postResponse = restTemplate.postForEntity(url, bookingSchedule,BookingSchedule.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        bookingSchedule = postResponse.getBody();
        System.out.println("Saved data: "+bookingSchedule);
        System.out.println(postResponse);
        System.out.println(postResponse.getBody());
        assertEquals(bookingSchedule.getPatientID(), postResponse.getBody().getPatientID());
    }

    @Test
    public void e_getall() {
        String url = baseURL + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }


    @Test
    public void b_read() {
        String url = baseURL + "read/"+ bookingSchedule.getPatientID();
        System.out.println("URL "+ url);
        ResponseEntity<BookingSchedule> getResponse = restTemplate.getForEntity(url,BookingSchedule.class);
        System.out.println("this is response--> "+getResponse);
        assertEquals(bookingSchedule,getResponse.getBody().getPatientID());
    }


    @Test
    public void c_update() {
        BookingSchedule updated = new BookingSchedule.Builder().copy(bookingSchedule).setPatientID("56866").build();
        String url = baseURL + "update";
        System.out.println("url "+ url);
        ResponseEntity<BookingSchedule> response = restTemplate.postForEntity(url,updated,BookingSchedule.class);
        assertEquals(updated.getPatientID(), response.getBody().getPatientID());
    }

    @Test
    public void e_delete() {
        String url = baseURL + "delete/" + bookingSchedule.getPatientID();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);
    }
}