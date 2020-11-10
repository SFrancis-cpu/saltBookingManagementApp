package com.saltsoftware.controller.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: testing of BookingSchedule controller
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingScheduleControllerTest {

    private static BookingSchedule bookingSchedule = BookingScheduleFactory.createBookingSchedule("10-02-2020", "13:00");
    private static String SECURITY_USERNAME = "Fish";
    private static String SECURITY_PASSWORD = "Bass";


    @Autowired
    private TestRestTemplate restTemplate;
    private  String baseURL = "http://localhost:8080/bookingSchedule";

    @Test
    public void a_create() {

        String url = baseURL + "create";
        System.out.println("Post data: " + bookingSchedule);
        ResponseEntity<BookingSchedule> postResponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, bookingSchedule,BookingSchedule.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(bookingSchedule.getBookingDate(), postResponse.getBody().getBookingDate());
    }

    @Test
    public void e_getall() {
        String url = baseURL + "all";
        System.out.println("URL "+ url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
        assertNotNull(response);
    }


    @Test
    public void b_read() {
        String url = baseURL + "read/"+ bookingSchedule.getBookingDate();
        System.out.println("URL "+ url);
        System.out.println(url);
        ResponseEntity<BookingSchedule> getResponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .getForEntity(url,BookingSchedule.class);
        System.out.println("this is response--> "+getResponse);
        assertNotNull(getResponse);
        //assertEquals(bookingSchedule,getResponse.getBody().getBookingID());
    }


    @Test
    public void c_update() {
        BookingSchedule updated = new BookingSchedule.Builder().copy(bookingSchedule).setBookingDate("25-02-2020").build();
        String url = baseURL + "update";
        System.out.println("url "+ url);
        ResponseEntity<BookingSchedule> response = restTemplate.postForEntity(url,updated,BookingSchedule.class);
        System.out.println(response.getBody().getBookingDate());
        assertEquals(updated.getBookingDate(), response.getBody().getBookingDate());
    }

    @Test
    public void e_delete() {
        String url = baseURL + "delete/" + bookingSchedule.getBookingID();
        System.out.println("URL: "+ url);
        restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .delete(url);
    }
}