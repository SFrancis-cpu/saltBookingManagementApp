package com.saltsoftware.service.employee.impl;

/*
        Author: Sakeena Francis
        Description: EmployeeRoleService - Difference between the service and repository is that the repository contains the database, the service does not, it only implements the business logic and whatever is in the repository
        Date: 07-09-2020

 */

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.repository.employee.EmployeeRoleRepository;
import com.saltsoftware.repository.employee.impl.EmployeeRoleRepositoryImpl;
import com.saltsoftware.service.employee.EmployeeRoleService;

import java.util.Set;

public class EmployeeRoleServiceImpl implements EmployeeRoleService {


    private static EmployeeRoleService service = null;
    private EmployeeRoleRepository repository;

    public EmployeeRoleServiceImpl ()
    {
        this.repository = EmployeeRoleRepositoryImpl.getEmployeeRoleRepository();
    }

    public static EmployeeRoleService PatientPaymentRecord(){
        if (service == null) service = new EmployeeRoleServiceImpl();
            return service;
    }

    @Override
    public Set<EmployeeRole> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeRole create(EmployeeRole employeeRole) {
        return this.repository.create(employeeRole);
    }

    @Override
    public EmployeeRole read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeRole update(EmployeeRole employeeRole) {
        return this.repository.update(employeeRole);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
