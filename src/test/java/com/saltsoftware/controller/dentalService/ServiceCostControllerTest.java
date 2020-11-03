/*
package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
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

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ServiceCostControllerTest {

        @Autowired
        private TestRestTemplate restTemplate;
        private String baseURL = "http://localhost:8080/servicecost/";

        //create
        @Test
        public void a_create() {
            ServiceCost serviceCost = ServiceCostFactory.buildServiceCost("test", " test");
            String url = baseURL + "create";
            System.out.println(url);

            ResponseEntity<ServiceCost> postResponse = restTemplate.postForEntity(url, serviceCost, ServiceCost.class);
            assertNotNull(postResponse);
            assertNotNull(postResponse.getBody());

            System.out.println(postResponse);
            System.out.println(postResponse.getBody());

        }

        @Test
        public void read() {
        }



        @Test
        public void c_update() {
        }

        @Test
        public void d_getall() {
            String url = baseURL + "all";
            System.out.println("URL: " + url);
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(null,headers);
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity,String.class);
            System.out.println(response);
            System.out.println(response.getBody());
            assertNotNull(response);
        }
}
*/
