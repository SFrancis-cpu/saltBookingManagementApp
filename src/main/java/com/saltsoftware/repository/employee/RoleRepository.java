package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.repository.Repository;

import java.util.Set;


public interface RoleRepository extends Repository <Role, String> {
 Set<Role>getAll();
}
