package com.saltsoftware.factory;
/* @author: Noluthando Nqwelo
/* @std no: 215029003
/* @description: Testing my Role Factory
/* @date: 13/07/2020
 */



import com.saltsoftware.entity.Role;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Before

    public void setUpRoleID(){
        Role role = RoleFactory.createRole("Receptionist");

    }

    @Test
    public void createRole() {
        Role role = RoleFactory.createRole("Receptionist" );
        Role role2 = RoleFactory.createRole("Doctor" );


        // Identity Test
        assertSame(role.getRoleDesc(), role.getRoleDesc());

        //Equality Test

        assertEquals(role.getRoleDesc(), role.getRoleDesc());
    }
}