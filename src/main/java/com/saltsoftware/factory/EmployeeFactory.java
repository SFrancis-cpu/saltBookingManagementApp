package com.saltsoftware.factory;

import com.saltsoftware.entity.Employee;
import com.saltsoftware.util.GenericHelper;

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
