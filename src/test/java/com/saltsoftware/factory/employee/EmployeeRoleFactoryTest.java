package com.saltsoftware.factory.employee;

/*   @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   Description: Test : EmployeeRoleFactory
 * */

import com.saltsoftware.entity.employee.EmployeeRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EmployeeRoleFactoryTest {

    public static void beforeClass() throws Exception {
        EmployeeRole empR = EmployeeRoleFactory.buildEmployeeRole("SF888590M", "Dentist001");
    }

    @Test
    public void getEmployeeRole() {
        //Testing object is sets values inserted
        EmployeeRole empRole = new EmployeeRole.Builder()
                .setEmpID("SF8885901")
                .setRoleID("Dentist0011")
                .build();
        assertEquals("SF8885901" + "Dentist0011", empRole.getEmpID() + empRole.getRoleID());
        System.out.println(empRole.toString());
    }

    @Test
    public void multipleObjects() {
        //Testing object are not the same
        EmployeeRole empRole2 = new EmployeeRole.Builder()
                .setRoleID("Receptionist002")
                .setEmpID("SF00999557")
                .build();

        EmployeeRole empRole1 = new EmployeeRole.Builder()
                .setEmpID("BF008400500")
                .setRoleID("Orthodontist002")
                .build();

        Assert.assertNotSame(empRole1, empRole2.toString());
        System.out.println(empRole1);
        System.out.println(empRole2);

    }
}




