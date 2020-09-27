package com.saltsoftware.service.employee;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.service.IService;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RoleService extends IService<Role, String> {
    Set<Role> getAll();

}
