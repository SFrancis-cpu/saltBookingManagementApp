package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Service;
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



import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class ServiceControllerTest {

    @Autowired
    private TestRestTemplate restTemp;
    private String baseURL = "Http://localhost:8080/service/";

    @Test
    public void a_create()
    {
        Service service = ServiceFactory.createService("Dentist", "Teeth alignment");
        String url = baseURL + "create";
        ResponseEntity<Service> postResponse = restTemp.postForEntity(url, service, Service.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());
    }
    @Test
    public void b_read()
    {
        Service service = restTemp.withBasicAuth("service","service")
                .getForObject(baseURL + "/service/1", Service.class);
        System.out.println(service.getServiceDescrip());
        assertNotNull(service);

    }
    @Test
    public void c_update()
    {

    }
    @Test
    public void d_allMethods()
    {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemp.exchange(baseURL,
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());


    }
    @Test
    public void c_delete()
    {


    }

}