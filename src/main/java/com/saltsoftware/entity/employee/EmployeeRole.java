package com.saltsoftware.entity.employee;

/* @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a EmployeeRole class
 *   change RoleTypes
 * */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(EmployeeRoleId.class)

public class EmployeeRole implements Serializable {

    @Id
       private String empID, roleID;

       protected EmployeeRole(){}

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

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Builder builder = (Builder) o;
                return empID.equals(builder.empID) &&
                        roleID.equals(builder.roleID);
            }

            @Override
            public int hashCode() {
                return Objects.hash(empID, roleID);
            }
        }


    }



