package com.saltsoftware.repository.employee.impl;
import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.factory.employee.EmployeeFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by :Abduragmaan Frank
 * Student no: 217009069
 * Desc: Create test class for  EmployeeRepositoryImpl
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    private static EmployeeRepository Repository = new EmployeeRepositoryImpl();
    private static Employee employee = EmployeeFactory.createEmployee("Abduragmaan","Frank");

//Test case for create method
    @Test
    public void a_testCreate() {
        Employee created =Repository.create(employee);
        Assert.assertEquals(employee.getEmpId(), created.getEmpId());
        System.out.println("created: "+ created);
    }

//Test case for read method
    @Test
    public void b_testRead() {
        Employee read = Repository.read(employee.getEmpId());
        Assert.assertEquals(employee.getEmpId(),read.getEmpId());
        System.out.println("Read : " +read);
    }

//Test case for update method
    @Test
    public void c_testUpdate() {
        Employee updated = new Employee.Builder().copy(employee).setempId("7667").build();
        Repository.update(updated);
        assertNotEquals(employee.getEmpId(), updated.getEmpId());
        System.out.println("updated: " + updated);

    }

//Test case for delete method
    @Test
    public void e_testDelete() {
        Repository.delete(employee.getEmpId());

    }

//Test case for getAll method
    @Test
    public void d_testGetAll() {
        Set<Employee> employee = Repository.getAll();
        Assert.assertEquals(employee.size(),employee.size());
        System.out.println(Repository.getAll());
    }
}