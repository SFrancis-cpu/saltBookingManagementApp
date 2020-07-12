package com.saltsoftware.factory;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   Create an EmployeeRole Factory
 * */

import com.saltsoftware.entity.EmployeeRole;
import com.saltsoftware.util.GenericHelper;


public class EmployeeRoleFactory {

    public static EmployeeRole createEmployeeRole(){
        String empID = GenericHelper.generateID();
        EmployeeRole employeeRole = new EmployeeRole.Builder()
                .setEmpID(empID)
                .build();
        return employeeRole;
    }
}
