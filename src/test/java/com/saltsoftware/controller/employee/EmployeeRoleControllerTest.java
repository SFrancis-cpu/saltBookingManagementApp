package com.saltsoftware.controller.employee;

//Sakeena Francis, 215006097, Part Time, EmployeeRole CRUD Test Controllers

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.factory.employee.EmployeeRoleFactory;
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

public class EmployeeRoleControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/remployeerole/";

    //create
    @Test
    public void a_create() {
        EmployeeRole employeeRole = EmployeeRoleFactory.buildEmployeeRole("b438ce8f-76b8-40f8-9a18-bf8b3592613E");
        String url = baseURL + "create";
        System.out.println(url);

        ResponseEntity<EmployeeRole> postResponse = restTemplate.postForEntity(url, employeeRole, EmployeeRole.class);
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

    @Test
    public void e_delete(){
        EmployeeRole employeeRole = EmployeeRoleFactory.buildEmployeeRole("b438ce8f-76b8-40f8-9a18-bf8b3592613E");
        String url = baseURL +"delete/" + employeeRole.getEmpID();
        System.out.println("URL: " +url);
        restTemplate.delete(url);
    }

}