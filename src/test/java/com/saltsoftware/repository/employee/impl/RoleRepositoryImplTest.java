package com.saltsoftware.repository.employee.impl;


import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.employee.RoleFactory;

import com.saltsoftware.repository.employee.RoleRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RoleRepositoryImplTest {
    private static RoleRepository repository = (RoleRepository) new RoleRepositoryImpl();
    private Role role = RoleFactory.createRole("Reception");

    //Create
    @Test
    public void a_createRole() {
        Role created = repository.create(role);
        assertEquals(role.getRoleDesc(), created.getRoleDesc());
        System.out.println("Create Role: " + created);
    }

    //Read
    @Test
    public void b_readRoleID() {
        Role read = repository.read(role.getRoleID());
        assertNotEquals(role.getRoleID(),read.getRoleID());
        System.out.println("Read Role: " +read);
    }

    //Update
    @Test
    public void c_updateRole() {

        Role updated = new Role.Builder().copy(role).setRoleDesc("Receptionist").build();
        repository.update(updated);
        System.out.println("Role Update: " + updated);
    }

    //Delete
    @Test
    public void e_delete() {
        repository.delete(role.getRoleID());
    }

    //GetAll
    @Test
    public void d_getAllRoles() {
        Set<Role> Roles = repository.getAll();
        assertNotEquals(1, Roles.size());
        System.out.println(repository.getAll());
    }
}