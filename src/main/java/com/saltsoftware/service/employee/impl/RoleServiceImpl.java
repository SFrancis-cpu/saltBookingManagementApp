package com.saltsoftware.service.employee.impl;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.repository.employee.impl.RoleRepositoryImpl;
import com.saltsoftware.service.employee.RoleService;
import org.springframework.stereotype.Service;

import java.util.Set;


/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Creating Role Service
 */
@Service
public class RoleServiceImpl implements RoleService {

    private static com.saltsoftware.service.employee.RoleService RoleService = null;
    private com.saltsoftware.repository.employee.RoleRepository RoleRepository;

    public RoleServiceImpl(){
        this.RoleRepository = RoleRepositoryImpl.getRoleRepository();
    }

    public static RoleService getService(){
        if(RoleService == null)
            RoleService =  new RoleServiceImpl();
        return RoleService;

    }
//Get All
    @Override
    public Set<Role> getAll() {
        return this.RoleRepository.getAll();
    }

//Create role
    @Override
    public Role create(Role role) {
        return this.RoleRepository.create(role);
    }

//Read role
    @Override
    public Role read(String RoleID) {
        return this.RoleRepository.read(RoleID);
    }

    //update role
    @Override
    public Role update(Role role) {
        return this.RoleRepository.update(role);
    }

    //delete role

    @Override
    public boolean delete(String RoleID) {
        return this.RoleRepository.delete(RoleID);
    }
}
