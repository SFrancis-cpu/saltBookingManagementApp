package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.repository.Repository;

import java.util.Set;

/**
 * Created by :Abduragmaan Frank
 * Student no: 217009069
 * */

public interface EmployeeRepository extends Repository<Employee, String> {
    Set<Employee>getAll();
}
