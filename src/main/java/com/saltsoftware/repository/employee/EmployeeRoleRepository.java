package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.EmployeeRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Set;

//Author: Sakeena Francis, has the "getALL method

@Repository
public interface EmployeeRoleRepository extends JpaRepository <EmployeeRole, String>{

}
