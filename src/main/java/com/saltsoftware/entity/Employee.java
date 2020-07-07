package com.saltsoftware.entity;

//Created by: Abduragmaan Frank
//Student Number: 217009069

public class Employee {
    private String empName, empLastName;
    private int empId;

    private Employee(Builder builder){
        this.empName= builder.empName;
        this.empLastName = builder.empLastName;
        this.empId = builder.empId;

    }
    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empId=" + empId +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public int getEmpId() {
        return empId;
    }

    public static class Builder{
        private String empName, empLastName;
        private int empId;

        public Builder setempName(String empName){
            this.empName = empName;
            return this;
        }
        public Builder setempLastName(String empLastName){
            this.empLastName = empLastName;
            return this;
        }
        public Builder setempName(int empId){
            this.empId = empId;
            return this;
        }
        public Builder copy(Employee employee){
            this.empName = employee.empName;
            this.empLastName = employee.empLastName;
            this.empId = employee.empId;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}
