package com.saltsoftware.service.employee.impl;

import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.repository.employee.EmployeeRepository;
import com.saltsoftware.repository.employee.impl.EmployeeRepositoryImpl;
import com.saltsoftware.service.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/* Author: Abduragmaan Frank
   Student no: 217009069
   Desc: Employee Service implementation
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeService service = null;
    private EmployeeRepository repository;

    public EmployeeServiceImpl(){

        this.repository = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeService getService(){
        if(service == null)
            service =  new EmployeeServiceImpl();
        return service;

    }

    @Override
    public Set<Employee> getAll() {

        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {

        return this.repository.create(employee);
    }

    @Override
    public Employee read(String s) {

        return this.repository.read(s);
    }

    @Override
    public Employee update(Employee employee) {

        return this.repository.update(employee);
    }

    @Override
    public boolean delete(String s) {

        return this.repository.delete(s);
    }
}
