package com.saltsoftware.factory;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a test case
 * */

import com.saltsoftware.entity.EmployeeRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRoleFactoryTest {

    @Test
    public void createEmployeeRole() {
        EmployeeRole employeeRole = EmployeeRoleFactory.createEmployeeRole();

        System.out.println(employeeRole);
    }

    /*//To handle or test timeout
    public class TimeoutTest {
        @Test(timeout=1000)  // milliseconds
        public void test() {
            while (true) {}
        }
    }

    @Test
    public void testCreateEmployeeRole() {
        EmployeeRole employeeRole = EmployeeRoleFactory.createEmployeeRole();
        mockStatic(employeeRole.class);
        when(UUID.randomUUID()).thenReturn("your-UUID");
        System.out.println(employeeRole);
    }
    */
}




