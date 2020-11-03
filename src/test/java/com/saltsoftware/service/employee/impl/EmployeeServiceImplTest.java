package com.saltsoftware.service.employee.impl;

import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.factory.employee.EmployeeFactory;
import com.saltsoftware.service.employee.EmployeeService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {
    @Autowired
    private EmployeeService service;
    private static Employee employee = EmployeeFactory.createEmployee("Abduragmaan","Frank");

    @Test
    public void d_GetAll() {
        Set<Employee> employee = service.getAll();
        Assert.assertEquals(1,employee.size());
        System.out.println("All employees"+employee);
    }
    @Test
    public void a_Create() {
        Employee created =service.create(employee);
        Assert.assertEquals(employee.getEmpId(), created.getEmpId());
        System.out.println("created: "+ created);
    }
    @Test
    public void b_Read() {
        Employee read = service.read(employee.getEmpId());
        Assert.assertEquals(employee.getEmpId(),read.getEmpId());
        System.out.println("Read : " +read);
    }
    @Test
    public void c_Update() {
        Employee updated = new Employee.Builder().copy(employee).setempLastName("Kam").build();
        service.update(updated);
        Assert.assertNotEquals(employee.getEmpLastName(), updated.getEmpLastName());
        System.out.println("updated: " + updated);
    }
    @Test
    public void e_Delete() {
        service.delete(employee.getEmpId());
    }
}