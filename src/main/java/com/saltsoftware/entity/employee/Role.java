package com.saltsoftware.entity.employee;

<<<<<<< HEAD
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
=======
import javax.persistence.Entity;
import javax.persistence.Id;
>>>>>>> e3b4e464d0e30f82240365ca2420d8f58fe1c1cd
import java.io.Serializable;
import java.util.Objects;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Entity with roleID and roleDescription
 */
<<<<<<< HEAD
@Entity
public class Role {
=======
>>>>>>> e3b4e464d0e30f82240365ca2420d8f58fe1c1cd

@Entity
public class Role  {

  @Id
    private String roleID;
    private String roleDesc;

    protected Role() {
    }

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


        public Role build() {
            return new Role(this);

        }

        @Override
        public boolean equals(Object object){
            if(this == object) return true;
            if(this == null || getClass() != object.getClass()) return false;
            Role role = (Role) object;
            return roleID.equals(role.roleID);

        }

        @Override
        public int hashCode() {
            return Objects.hash(roleID);
        }
    }
}
