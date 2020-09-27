package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.test.context.junit4.SpringRunner.*;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class CostControllerTest<cost> {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/cost/";
    private java.lang.Object cost;
    private java.lang.Object Cost;
    private java.lang.String myURL;

    public CostControllerTest(TestRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //create
    @Test
    public void a_create() {
        java.lang.String myURL = "";
        String URL = myURL + "create";

        System.out.println("Post data"+ cost);
        ResponseEntity<Cost> postResponse = restTemplate.postForEntity(myURL,cost,Cost.class);
        assertNotNull(postResponse);
        Assert.assertEquals(Cost, java.util.Objects.requireNonNull(postResponse.getBody()).getCostID());
    }

    @Test
    public void read() {
    }


    @Test
    public void update() {
    }

    @Test
    public void e_delete() {
        String url = myURL +"delete/"+ cost;
        System.out.println("URL: "+url);
        try {
            restTemplate.delete(baseURL);
        } catch (RestClientException e) {
            e.contains(Cost.class);
        }
    }

    //Test case for getAll method
    @Test
    public void d_getAll() {
        java.lang.String myURL = "";
        String url = myURL + "all";
        System.out.println("URL "+ url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println(response);
        System.out.println(response.getBody());
        assertNotNull(response);
    }
}
