package com.saltsoftware.controller.employee;



import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.employee.EmployeeRoleFactory;
import com.saltsoftware.service.employee.impl.EmployeeRoleServiceImpl;
import com.saltsoftware.service.employee.impl.EmployeeServiceImpl;
import com.saltsoftware.service.employee.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * Sakeena Francis
 * Part Time
 * 215006097
 * 22-Sep-2020
 * EmployeeRoleController: created for mapping to employeerole (base), "CRUD" path of the application
 */

import java.util.Set;

@RestController
@RequestMapping("/employeeRole")
public class EmployeeRoleController {

    @Autowired
    private EmployeeRoleServiceImpl employeeRoleService;

    @Autowired //used to create a connection to the Employee service package
    private EmployeeServiceImpl employeeService;

    @Autowired //used to create a connection to the Role service package
    private RoleServiceImpl roleService;

    @PostMapping("/create")
    public EmployeeRole create(@RequestBody EmployeeRole employeeRole) {
 /*       boolean employeeExist = false;
        boolean roleExist = false;

        Employee employee = employeeService.read(employeeRole.getEmpID()); //call employee using EmpID
        if (employee.getEmpId() != null) {
            employeeExist = true;
        }

        Role role = roleService.read(employeeRole.getRoleID()); //call role using RoleID
        if (role.getRoleID() != null) {
            roleExist = true;
        }

        if (employeeExist==true && roleExist == true)
            return employeeRoleService.create(employeeRole);

        else */ EmployeeRole newER = EmployeeRoleFactory.buildEmployeeRole(employeeRole.getEmpID(), employeeRole.getRoleID());
            return employeeRoleService.create(newER);
    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public EmployeeRole read(@PathVariable String id) {
        return employeeRoleService.read(id);
    }

    //update
    @PutMapping("/update/{id}")
    public EmployeeRole update(@RequestBody EmployeeRole employeeRole){
        return employeeRoleService.update(employeeRole);
    }

    //getall
    @GetMapping("/all")
    public Set<EmployeeRole> getall(){
        return employeeRoleService.getAll();
    }

    //delete
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        employeeRoleService.delete(id);
    }

}

