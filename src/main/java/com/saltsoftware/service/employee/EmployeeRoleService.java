package com.saltsoftware.service.employee;

/*
        Author: Sakeena Francis
        Description: EmployeeRoleService - Difference between the service and repository is that the repository contains the database, the service does not, it only implements the business logic and whatever is in the repository
        Date: 07-09-2020

 */

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.service.IService;
import java.util.Set;

public interface EmployeeRoleService extends IService<EmployeeRole, String> {
    Set<EmployeeRole> getAll();

    // unique business logic
}
