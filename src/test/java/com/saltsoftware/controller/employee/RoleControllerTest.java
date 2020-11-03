package com.saltsoftware.controller.employee;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.employee.RoleFactory;
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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Creating Role Controller test
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RoleControllerTest {


    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/role/";

    private static Role role = RoleFactory.createRole("Reception");

    // creating role
    @Test
    public void a_create() {
        Role role = RoleFactory.createRole("Reception");
        String url = baseURL + "create";
        System.out.println("Created " + role);
        ResponseEntity<Role> responseEntity = restTemplate.postForEntity(url, role, Role.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
        role = responseEntity.getBody();
        assertEquals(role.getRoleID(), responseEntity.getBody().getRoleID());
    }

    //reading the role
    @Test
    public void b_read() {
        String url = baseURL + "read" + role.getRoleID();
        System.out.println("read " + role);
        ResponseEntity<Role> responseEntity = restTemplate.getForEntity(url,Role.class);
        assertNotNull(responseEntity);

    }

    //updating the description on the role
    @Test
    public void c_update() {
        Role updated = new Role.Builder().copy(role).setRoleDesc("Receptionist").build();
        String url = baseURL + "update";
        ResponseEntity<Role> responseEntity = restTemplate.postForEntity(url,updated, Role.class);
        assertNotNull(responseEntity);
        assertNotNull(updated);
        System.out.println("updated " + updated);
    }

    //deleting the role
    @Test
    public void e_delete() {
        String url = baseURL + "delete";
        System.out.println("deleted " + role);
        restTemplate.delete(role.getRoleID());
    }

    @Test
    public void d_getAll() {
        String url = baseURL + "all";
        System.out.println("Get all" + role);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity <String> entity = new HttpEntity<>(null,headers);
        ResponseEntity <String> responseEntity = restTemplate.exchange(url, HttpMethod.GET,entity, String.class );
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);

    }
}