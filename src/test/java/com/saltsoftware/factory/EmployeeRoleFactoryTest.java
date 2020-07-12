package com.saltsoftware.factory;

/*   @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a test case
 * */

import com.saltsoftware.entity.EmployeeRole;
import org.junit.Test;

import static org.junit.Assert.*;

    public class EmployeeRoleFactoryTest {

        @Test
        public void testCreateEmployeeRole() {
            EmployeeRole emp1 = EmployeeRoleFactory.createEmployeeRole();

            //Equality test
            assertEquals(emp1.getEmpID(),emp1.getEmpID());
        }


    }






