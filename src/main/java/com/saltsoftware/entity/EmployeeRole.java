package com.saltsoftware.entity;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a EmployeeRole class
 *   change RoleTypes
 * */

public class EmployeeRole {

       private String empID, roleID;


        private EmployeeRole(Builder builder) {
            this.empID = builder.empID;
            this.roleID = builder.roleID;
        }

        public String getEmpID() {
            return empID;
        }

        public String getRoleID() {
            return roleID;
        }

        @Override
       public String toString() {
            return "EmployeeRole{" +
                    "empID=" + empID +
                    ", roleID=" + roleID +
                    '}';
        }

        public static class Builder {
            private String empID, roleID;
            public Builder setEmpID(String empID) {
                this.empID = empID;
                return this;
            }

            public Builder setRoleID(String roleID) {
                this.roleID = roleID;
                return this;
            }

            public Builder copy(EmployeeRole employeeRole){
                this.empID = employeeRole.empID;
                this.roleID = employeeRole.roleID;
                return this;
            }

            public EmployeeRole build(){
                return new EmployeeRole(this);
            }

        }

    }


