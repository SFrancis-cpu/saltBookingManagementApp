package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.factory.dentalService.CostFactory;
import com.saltsoftware.controller.dentalService.CostController;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertNotNull;

/**
 * Created by :Junade Frizlar
 * Student number: 208046402
 * Description: testing of Cost controller
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CostControllerTest {

    private static Cost cost = CostFactory.buildCost("40","60");
    private static String SECURITY_USERNAME = "salt";
    private static String SECURITY_PASSWORD = "password";

    @Autowired
    private TestRestTemplate restTemplate;
    private String myURL = "http://localhost:8080/saltbookingmanagementapp/cost";

    @Test
    public void a_create() {
        String url = myURL + "create";
        System.out.println("URL: "+url);
        System.out.println("Post data: "+cost);

        ResponseEntity<Cost> postResponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .postForEntity(url,cost,Cost.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        cost = postResponse.getBody();

        System.out.println("Your Cost id's are as follows: "+cost);
        System.out.println(postResponse);
        System.out.println(postResponse.getBody());

        Assert.assertEquals(HttpStatus.FORBIDDEN, postResponse.getStatusCode());
        Assert.assertEquals(cost.getCostID(), cost.getCostID(cost));
    }

    //reading the Cost
    @Test
    public void b_read() {
        String url = myURL + "read" + cost.getCostID();
        System.out.println("read " + cost);
        ResponseEntity<Cost> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .getForEntity(url,Cost.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    //updating the description for the cost
    @Test
    public void c_update() {
        Cost updated = new Cost.Builder().copy(cost).setCostID("60").setAmount(40.00).build();
        String url = myURL + "update";
        ResponseEntity<Cost> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .postForEntity(url,updated, Cost.class);
        assertNotNull(responseEntity);
        assertNotNull(updated);
        System.out.println("updated " + updated);
    }


    @Test
    public void e_delete() {
        String url = myURL +"delete/"+ cost.getCostID();
        System.out.println("URL: "+url);
        restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .delete(url);
    }

    @Test
    public void d_getAll() {
        String url = myURL + "all";
        System.out.println("Get all" + cost);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity <String> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET,entity, String.class );
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);

    }
}