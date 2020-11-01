package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.dentalService.ServiceFactory;
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


/* Student: Abram Rakgotho
 * Student Number: 215031393
 * Group: Part time
 * Role: Testing the functionality of serviceController
 */

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ServiceControllerTest {

    private static Service service = ServiceFactory.createService("Dentist", "Teeth Alignment");

    @Autowired
    private TestRestTemplate restTemp;
    private String baseURL = "Http://localhost:8080/service/";

    @Test
    public void a_create()
    {
        //Service service = ServiceFactory.createService("Dentist", "Teeth alignment");
        String url = baseURL + "create";
        System.out.println("URL: " + url);
        ResponseEntity<Service> postResponse = restTemp.postForEntity(url, service, Service.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());
    }
    @Test
    public void b_read()
    {

        String url = baseURL + "read" + service.getServiceId();
        System.out.println("read  " +service);
        ResponseEntity<Service> res = restTemp.getForEntity(url,Service.class);
        assertNotNull(res);
        assertNotNull(res.getBody());

        /*Service service = restTemp.withBasicAuth("service","service")//just creating a basic authentication
                .getForObject(url + "/service", Service.class);
        System.out.println(service.getServiceId());
        assertNotNull(service);*/

    }
    @Test
    public void c_update()
    {
        Service updated = new Service.Builder().copy(service).setServiceName("Dentist")
                .setServiceDescrip("Teeth removal").build();
        String url = baseURL + "update";
        System.out.println("URL: " + url); //This printout enables me to literally display my URL to the output.
        ResponseEntity<Service> response = restTemp.postForEntity(url, updated, Service.class);
        assertEquals(service.getServiceId(), response.getBody().getServiceId());
        System.out.println(response);

    }
    @Test
    public void d_getAll()
    {
        //The server has not found anything matching the requestit  URL
        String url = baseURL + " all";
        System.out.println("URL: " +url);
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemp.exchange(url,
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());


    }
    @Test
    public void e_delete()
    {

        String url = baseURL + "delete/" + service.getServiceId();
        System.out.println("URL: " +url);
        restTemp.delete(url);


    }

}