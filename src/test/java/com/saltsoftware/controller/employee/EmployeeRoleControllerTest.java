package com.saltsoftware.controller.employee;

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.entity.payment.PatientPaymentRecord;
import com.saltsoftware.factory.employee.EmployeeRoleFactory;
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
 * Created by :Sakeena Francis
 * Student no: 215006097
 * Desc: testing of EmployeeRole controller
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeRoleControllerTest {

        private static EmployeeRole employeeRole = EmployeeRoleFactory.buildEmployeeRole("DEN0001YR2020","Dentist00001");
        private static String SECURITY_USERNAME = "salt";
        private static String SECURITY_PASSWORD = "password";

        @Autowired
        private TestRestTemplate restTemplate;
        private String myURL = "http://localhost:8080/saltbookingmanagementapp/employeerole";

        @Test
        public void a_create() {
                String url = myURL + "create";
                System.out.println("URL: "+url);
                System.out.println("Post data: "+employeeRole);

                ResponseEntity<EmployeeRole> postResponse = restTemplate
                        .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .postForEntity(url,employeeRole,EmployeeRole.class);
                assertNotNull(postResponse);
                assertNotNull(postResponse.getBody());
                employeeRole = postResponse.getBody();

                System.out.println("Your Employee Role id's are as follows: "+employeeRole);
                System.out.println(postResponse);
                System.out.println(postResponse.getBody());

                Assert.assertEquals(HttpStatus.FORBIDDEN, postResponse.getStatusCode());
                Assert.assertEquals(employeeRole.getEmpID(), employeeRole.getRoleID());
        }

//reading the employeerole


@Test
public void b_read() {
        String url = myURL + "read" + employeeRole.getRoleID();
        System.out.println("read " + employeeRole);
        ResponseEntity<EmployeeRole> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .getForEntity(url,EmployeeRole.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
        }


//updating the description on the role
@Test
public void c_update() {
        EmployeeRole updated = new EmployeeRole.Builder().copy(employeeRole).setEmpID("ORTH0001YR2021").setRoleID("ORTH00001").build();
        String url = myURL + "update";
        ResponseEntity<EmployeeRole> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .postForEntity(url,updated, EmployeeRole.class);
        assertNotNull(responseEntity);
        assertNotNull(updated);
        System.out.println("updated " + updated);
        }


        @Test
        public void e_delete() {
                String url = myURL +"delete/"+ employeeRole.getEmpID();
                System.out.println("URL: "+url);
                restTemplate
                        .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                        .delete(url);
        }

@Test
public void d_getAll() {
        String url = myURL + "all";
        System.out.println("Get all" + employeeRole);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity <String> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET,entity, String.class );
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);

        }
}