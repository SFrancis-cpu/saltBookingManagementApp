package com.saltsoftware.service.employee.impl;

/*
        Author: Sakeena Francis
        Description: EmployeeRoleService TEST - Difference between the service and repository is that the repository contains the database, the service does not, it only implements the business logic and whatever is in the repository
        Date: 07-09-2020

 */

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.factory.employee.EmployeeRoleFactory;
import com.saltsoftware.service.employee.EmployeeRoleService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRoleServiceImplTest {

    private static EmployeeRoleService service = EmployeeRoleServiceImpl.getService();
    private static EmployeeRole employeeRole = EmployeeRoleFactory.buildEmployeeRole("Ma885");


    //GetAll from the DB
    @Test
    public void d_getAll() {
        Set<EmployeeRole> employeeRoles = service.getAll();
        assertEquals(1, employeeRoles.size());
        System.out.println("All employee roles: " + employeeRoles);
    }

    //Create Method
    @Test
    public void a_create() {
        EmployeeRole created = service.create(employeeRole);
        assertEquals(employeeRole.getEmpID(), created.getEmpID());
        System.out.println("Create: " + created);
    }

    //Read Method
    @Test
    public void b_read() {
        EmployeeRole read = service.read(employeeRole.getEmpID());
        assertEquals(employeeRole.getEmpID(), read.getEmpID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        //EmployeeRole updated = new EmployeeRole.Builder().setEmpID("").build();
        EmployeeRole updated = new EmployeeRole.Builder().copy(employeeRole).setEmpID("588").build();
        service.update(updated);
        assertNotEquals(employeeRole.getEmpID(), updated.getEmpID());
        System.out.println("Update: " + updated);
    }

    //Delete Method
    @Test
    public void e_delete() {
        service.delete(employeeRole.getEmpID());
    }
}