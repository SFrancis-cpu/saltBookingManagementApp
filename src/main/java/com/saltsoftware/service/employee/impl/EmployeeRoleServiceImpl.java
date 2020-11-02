package com.saltsoftware.service.employee.impl;

/*
        Author: Sakeena Francis
        Description: EmployeeRoleService - Difference between the service and repository is that the repository contains the database, the service does not, it only implements the business logic and whatever is in the repository
        Date: 07-09-2020

 */

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.repository.employee.EmployeeRoleRepository;
import com.saltsoftware.service.employee.EmployeeRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeRoleServiceImpl implements EmployeeRoleService {

    private static EmployeeRoleService service = null;

    @Autowired
    private EmployeeRoleRepository repository;

    @Override
    public Set<EmployeeRole> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public EmployeeRole create(EmployeeRole employeeRole) {
        return this.repository.save(employeeRole);
    }

    @Override
    public EmployeeRole read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public EmployeeRole update(EmployeeRole employeeRole) {
        if(this.repository.existsById(employeeRole.getEmpID())) {
            return this.repository.save(employeeRole);
        }
        return null;
    }


    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if(this.repository.existsById(s)) return false;
        else return true;
    }
}
