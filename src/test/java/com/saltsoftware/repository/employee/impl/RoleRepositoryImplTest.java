package com.saltsoftware.repository.employee.impl;


import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.employee.RoleFactory;

import com.saltsoftware.repository.employee.RoleRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Repository test
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RoleRepositoryImplTest {
    private static RoleRepository repository = (RoleRepository) new RoleRepositoryImpl();
    private static Role role = RoleFactory.createRole("Reception");

    //Creating the role
    @Test
    public void a_createRole() {
        Role created = repository.create(role);
        assertEquals(role.getRoleDesc(), created.getRoleDesc());
        System.out.println("Create Role: " + created);
    }

    //Reading the role information
    @Test
    public void b_readRoleID() {
        Role read = repository.read(role.getRoleID());
        Assert.assertEquals(role.getRoleID(),read.getRoleID());
        System.out.println("Read Role: " +read);
    }

    //Updating the description of the role
    @Test
    public void c_updateRole() {

        Role updated = new Role.Builder().copy(role).setRoleDesc("Receptionist").build();
        updated = repository.update(updated);
        System.out.println("Role Update: " + updated);
    }

    //Deleting the role
    @Test
    public void e_delete() {
        repository.delete(role.getRoleID());
    }

    //GetAll the information
    @Test
    public void d_getAllRoles() {
        Set<Role> roles = repository.getAll();
        assertEquals(1,roles.size());
        System.out.println(repository.getAll());
    }
}