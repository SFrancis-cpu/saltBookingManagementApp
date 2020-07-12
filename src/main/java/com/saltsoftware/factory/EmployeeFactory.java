package com.saltsoftware.factory;

import com.saltsoftware.entity.Employee;
import com.saltsoftware.util.GenericHelper;

/**
 * Created by :Abduragmaan Frank
 * Student no: 217009069
 * Desc: Create Employee Factory
 */

public class EmployeeFactory {

    public static Employee  createEmployee(String empName, String empLastName){
        String employeeID = GenericHelper.generateID();
        Employee employee = new Employee.Builder()
                .setempId(employeeID)
                .setempName(empName)
                .setempLastName(empLastName)
                .build();
       return employee;
    }
}
