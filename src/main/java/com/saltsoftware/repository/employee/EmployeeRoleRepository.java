package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.repository.Repository;
import java.util.Set;

//Author: Sakeena Francis, has the "getALL method

public interface EmployeeRoleRepository extends Repository<EmployeeRole, String> {
    Set<EmployeeRole> getAll();
}
