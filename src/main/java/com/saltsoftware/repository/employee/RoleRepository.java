package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.repository.Repository;

import java.util.Set;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Repository
 */
public interface RoleRepository extends Repository <Role, String> {
 Set<Role>getAll();
}
