package com.saltsoftware.entity.employee;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   ENTITY: This is a EmployeeRole class is a bridging class for Role ID and Employee ID
 * */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import java.io.Serializable;
import java.util.Objects;

@Entity
//@IdClass(EmployeeRoleId.class)

public class EmployeeRole implements Serializable {

    @Id
    private String empRoleID;
    private String empID;
    private String roleID;

       protected EmployeeRole(){}

        private EmployeeRole(Builder builder) {
            this.empRoleID = builder.empRoleID;
            this.empID = builder.empID;
            this.roleID = builder.roleID;
        }

        public String getEmpID() {
            return empID;
        }

        public String getRoleID() {
            return roleID;
        }

        public String getEmpRoleID() {return empRoleID;
    }

    @Override
        public String toString() {
            return "EmployeeRole{" +
                    "empRoleID=" + empRoleID +
                    ", empID=" + empID +
                    ", roleID=" + roleID +
                    '}';
        }

        public static class Builder {
            private String empID, roleID, empRoleID;
            public Builder setEmpID(String empID) {
                this.empID = empID;
                return this;
            }

            public Builder setRoleID(String roleID) {
                this.roleID = roleID;
                return this;
            }

            public Builder setEmpRoleID(String empRoleID) {
                this.empRoleID = empRoleID;
                return this;
            }

            public Builder copy(EmployeeRole employeeRole){
                this.empID = employeeRole.empID;
                this.roleID = employeeRole.roleID;
                this.empRoleID = employeeRole.empRoleID;
                return this;
            }

            public EmployeeRole build(){
                return new EmployeeRole(this);
            }
         }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeRole that = (EmployeeRole) o;
        return empRoleID.equals(that.empRoleID) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empRoleID);
    }
}



