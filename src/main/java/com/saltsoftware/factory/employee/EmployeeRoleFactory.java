package com.saltsoftware.factory.employee;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   Create an EmployeeRole Factory
 * */

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.util.GenericHelper;


public class EmployeeRoleFactory {

    //BuildEmployeeRole with parameter
    public static EmployeeRole buildEmployeeRole(String empID) {

        String roleID = GenericHelper.generateID();

        EmployeeRole employeeRole = new EmployeeRole.Builder()
                .setEmpID(empID)
                .setRoleID(roleID)
                .build();
        return employeeRole;
    }


    //CreateEmployeeRole without parameter
    public static EmployeeRole createEmployeeRole() {

        String roleID = GenericHelper.generateID();
        String empID = GenericHelper.generateID();

        EmployeeRole employeeRole = new EmployeeRole.Builder()
                .setRoleID(roleID)
                .setEmpID(empID)
                .build();
        return employeeRole;
    }
}


