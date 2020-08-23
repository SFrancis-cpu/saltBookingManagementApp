package com.saltsoftware.repository.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.repository.Repository;

import java.util.Set;

public interface ServiceRepository extends Repository<Service, String>
{
    Set<Service> getAll();
}
