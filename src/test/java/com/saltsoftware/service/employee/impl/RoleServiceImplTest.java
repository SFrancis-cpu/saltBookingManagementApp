package com.saltsoftware.service.employee.impl;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.employee.RoleFactory;
import com.saltsoftware.service.employee.RoleService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

 /* @author - Noluthando Nqwelo
 /* @std no - 215029003
 /* @Description - Creating Role Service test
  */

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    public class RoleServiceImplTest {
        private static com.saltsoftware.service.employee.RoleService RoleService = (RoleService) new RoleServiceImpl();
        private static Role role = RoleFactory.createRole("Reception");



        //getting all
    @Test
    public void d_getAllRoles() {
        Set<Role> roles = RoleService.getAll();
        assertEquals(1, roles.size());
        System.out.println(RoleService.getAll());
    }

    //creating role
    @Test
    public void a_createRole() {
        Role created = RoleService.create(role);
        assertEquals(role.getRoleDesc(), created.getRoleDesc());
        System.out.println("Create Role: " + created);
    }

    //reading the role created
    @Test
    public void b_readRoleID() {
        Role read = RoleService.read(role.getRoleID());
        assertEquals(role.getRoleID(), read.getRoleID());
        System.out.println("Read Role: " +read);
    }

    //updating the description of the role
    @Test
    public void c_updateRole() {
        Role updated = new Role.Builder().copy(role).setRoleDesc("Receptionist").build();
        updated = RoleService.update(updated);
        System.out.println("Role Update: " + updated);
    }

    //deleting the role
    @Test
    public void e_deleteRole() {
        RoleService.delete(role.getRoleID());
    }
}