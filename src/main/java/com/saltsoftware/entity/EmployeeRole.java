package com.saltsoftware.entity;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a EmployeeRole class
 * */

public class EmployeeRole {

       private int empID, roleID;



        private EmployeeRole(Builder builder) {

            this.empID = builder.empID;

            this.roleID = builder.roleID;

        }



        public int getEmpID() {

            return empID;

        }



        public int getRoleID() {

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

            private int empID, roleID;



            public Builder setEmpID(int empID) {

                this.empID = empID;

                return this;

            }



            public Builder setRoleID(int roleID) {

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


