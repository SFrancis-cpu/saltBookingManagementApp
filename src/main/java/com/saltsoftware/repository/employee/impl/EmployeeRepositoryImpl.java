//package com.saltsoftware.repository.employee.impl;
//import com.saltsoftware.entity.employee.Employee;
//import com.saltsoftware.repository.employee.EmployeeRepository;
//
//import java.util.HashSet;
//import java.util.Set;
///**
// * Created by :Abduragmaan Frank
// * Student no: 217009069
// * Desc: Create Employee Repository
// */
//
//public class EmployeeRepositoryImpl implements EmployeeRepository {
//    private Set<Employee>EmployeeDB;
//    public static EmployeeRepository employeeRepository = null;
//
////Constructor
//    public EmployeeRepositoryImpl(){
//        this.EmployeeDB = new HashSet<>();
//    }
//
//    public static EmployeeRepository getEmployeeRepository(){
//        if(employeeRepository == null)
//            employeeRepository = new EmployeeRepositoryImpl();
//        return employeeRepository;
//    }
//
//
//// This method creates a Employee
//    @Override
//    public Employee create(Employee employee) {
//        this.EmployeeDB.add(employee);
//        return employee;
//    }
////This method reads from Employee database
//    @Override
//    public Employee read(String empId) {
//        Employee employee = null;
//        for(Employee e : this.EmployeeDB){
//            if(e.getEmpId().equalsIgnoreCase(empId)){
//                employee = e;
//                break;
//            }
//        }
//        return employee;
//    }
//
//    //This method updates an existing employee
//    public Employee update(Employee employee) {
//        Employee oldEmployee = read(employee.getEmpId());
//        if(oldEmployee != null){
//            this.EmployeeDB.remove(oldEmployee);
//            this.EmployeeDB.add(employee);
//        }
//        return employee;
//    }
//
//    //This method removes and employee object
//    public boolean delete(String empId) {
//        Employee employee = read(empId);
//        if(employee != null);
//        this.EmployeeDB.remove(employee);
//
//        return false;
//    }
//    @Override
//    public Set<Employee> getAll() {
//        return this.EmployeeDB;
//    }
//}
