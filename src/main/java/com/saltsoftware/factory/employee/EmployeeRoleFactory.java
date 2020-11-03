package com.saltsoftware.factory.employee;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   Create an EmployeeRole Factory
 * */

;
import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.util.GenericHelper;


public class EmployeeRoleFactory {

    //BuildEmployeeRole with parameter
    public static EmployeeRole buildEmployeeRole(String empID, String roleID) {

         EmployeeRole employeeRole = new EmployeeRole.Builder()
                .setEmpID(empID)
                .setRoleID(roleID)
                .build();
        return employeeRole;
    }
}



