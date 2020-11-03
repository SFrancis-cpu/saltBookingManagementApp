package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by :Abduragmaan Frank
 * Student no: 217009069
 * */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String>{

}
