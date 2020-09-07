package com.saltsoftware.service.employee;

import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.service.IService;

/*      Author: Abduragmaan Frank
        Student 217009069
*/

import java.util.Set;

public interface EmployeeService extends IService <Employee, String >{
    Set<Employee> getAll();
}
