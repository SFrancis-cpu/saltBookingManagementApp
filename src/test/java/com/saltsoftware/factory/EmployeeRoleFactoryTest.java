package com.saltsoftware.factory;

/*   @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a test case
 * */

import com.saltsoftware.entity.EmployeeRole;
import org.junit.Test;

import static org.junit.Assert.*;

    public class EmployeeRoleFactoryTest {

        private EmployeeRole emp1 = EmployeeRoleFactory.createEmployeeRole();
        private EmployeeRole emp2 = EmployeeRoleFactory.createEmployeeRole();

        @Test
        public void testCreateEmployeeRole() {
        }

        @Test
        public void testEquality() {

            //Equality test
            assertEquals(emp1.getEmpID(),emp1.getEmpID());
            assertEquals(emp2.getRoleID(),emp2.getRoleID());
        }

        @Test
        public void testNotNull() {//NotNull test
            assertNotNull(emp1.getEmpID());
            assertNotNull(emp2.getRoleID());
        }

        @Test
        public void testIdentity(){
            //Identity test
            assertSame(emp1.getEmpID(), emp1.getEmpID());
            assertSame(emp2.getRoleID(), emp2.getRoleID());
        }

    }






