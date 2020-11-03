package com.saltsoftware.repository.employee;

import com.saltsoftware.entity.employee.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Repository
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}
