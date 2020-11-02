package com.saltsoftware.entity.employee;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeRoleId implements Serializable {
    private String empID, roleID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeRoleId that = (EmployeeRoleId) o;
        return empID.equals(that.empID) &&
                roleID.equals(that.roleID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, roleID);
    }
}
