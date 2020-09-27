package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.factory.dentalService.CostFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.StringCache;
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
import org.springframework.web.client.RestClientException;



import static org.junit.Assert.*;

//Random port to avoid an already used port
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CostControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private  String baseURL = "http://localhost:8080/cost";

    @Test
    public void create() {
    }

    /*@Test
    public void getAll()
    {
        String url = baseURL + "all";
        System.out.println("url:" + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
        assertNotNull(response);
    }*/

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete()
    {
        String url = baseURL +"/cost"+restTemplate;
        System.out.println("URL: "+url);
        try {
            restTemplate.delete(url);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
    }
}