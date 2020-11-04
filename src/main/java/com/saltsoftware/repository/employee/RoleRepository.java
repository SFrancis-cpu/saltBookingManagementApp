package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.repository.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Repository
 */
public interface RoleRepository extends JpaRepository<Role, String> {

}
