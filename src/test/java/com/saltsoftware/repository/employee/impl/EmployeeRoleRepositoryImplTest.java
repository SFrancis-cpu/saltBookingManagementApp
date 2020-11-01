/*package com.saltsoftware.repository.employee.impl;

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.factory.employee.EmployeeRoleFactory;
import com.saltsoftware.repository.employee.EmployeeRoleRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRoleRepositoryImplTest {


    private static EmployeeRoleRepository repository = new EmployeeRoleRepositoryImpl();
    private static EmployeeRole employeeRole = EmployeeRoleFactory.buildEmployeeRole("Ma885");

    //Create Method
    @Test
    public void a_create() {
        EmployeeRole created = repository.create(employeeRole);
        assertEquals(employeeRole.getEmpID(), created.getEmpID());
        System.out.println("Create: " + created);
    }

    //Read Method
    @Test
    public void b_read() {
        EmployeeRole read = repository.read(employeeRole.getEmpID());
        assertEquals(employeeRole.getEmpID(), read.getEmpID());
        System.out.println("Read: " + read);
    }

    //Update Method
    @Test
    public void c_update() {
        //EmployeeRole updated = new EmployeeRole.Builder().setEmpID("").build();
        EmployeeRole updated = new EmployeeRole.Builder().copy(employeeRole).setEmpID("588").build();
        repository.update(updated);
        assertNotEquals(employeeRole.getEmpID(), updated.getEmpID());
        System.out.println("Update: " + updated);
    }

   //Delete Method
    @Test
    public void e_delete() {
        repository.delete(employeeRole.getEmpID());
    }
/
    //GetAll from the DB
    //@Test
    //public void d_getAll() {
        Set<EmployeeRole> employeeRoles = repository.getAll();
        assertEquals(1, employeeRoles.size());
        System.out.println(repository.getAll());
    }
}
*/