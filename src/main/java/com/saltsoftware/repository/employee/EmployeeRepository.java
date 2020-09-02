package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.repository.Repository;

import java.util.Set;

public interface EmployeeRepository extends Repository<Employee, String> {
    Set<Employee>getAll();
}
