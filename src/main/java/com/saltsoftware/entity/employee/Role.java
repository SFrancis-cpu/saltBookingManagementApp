package com.saltsoftware.entity.employee;

import java.io.Serializable;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Entity with roleID and roleDescription
 */
public class Role implements Serializable {
        private static String roleID;
    private static String roleDesc;

    private Role(){}

        private Role(Builder builder) {
            this.roleID = builder.roleID;
            this.roleDesc = builder.roleDesc;
        }

    public String getRoleID() {
        return roleID;
    }

    public String getRoleDesc() {
        return roleDesc;
        }

        @Override
        public String toString() {
            return "Role{" +
                    "roleID='" + roleID + '\'' +
                    ", roleDesc='" + roleDesc + '\'' +
                    '}';
        }


        public static class Builder {
            private String roleID, roleDesc;

            public Builder setRoleID(String roleID) {
                this.roleID = roleID;
                return this;
            }

            public Builder setRoleDesc(String roleDesc) {
                this.roleDesc = roleDesc;
                return this;
            }


            public Builder copy(Role role) {
                this.roleID = role.roleID;
                this.roleDesc = role.roleDesc;
                return this;
            }


            public Role build(){
                return new Role(this);

            }
        }
    }

