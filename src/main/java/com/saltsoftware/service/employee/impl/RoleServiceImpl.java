package com.saltsoftware.service.employee.impl;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.service.employee.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;


/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Creating Role Service
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private com.saltsoftware.repository.employee.RoleRepository RoleRepository;


//Get All
    @Override
    public Set<Role> getAll() {
        return this.RoleRepository.findAll().stream().collect(Collectors.toSet());
    }

//Create role
    @Override
    public Role create(Role role) {
        return this.RoleRepository.save(role);
    }

//Read role
    @Override
    public Role read(String RoleID) {
        return this.RoleRepository.findById(RoleID).orElse(null);
    }

    //update role
    @Override
    public Role update(Role role) {
        if (this.RoleRepository.existsById(role.getRoleID())){
            return this.RoleRepository.save(role);

        }
        return null;
    }

    //delete role

    @Override
    public boolean delete(String RoleID) {
        this.RoleRepository.deleteById(RoleID);
        if ((this.RoleRepository.existsById(RoleID))) return true;
         else return false;
    }

}
