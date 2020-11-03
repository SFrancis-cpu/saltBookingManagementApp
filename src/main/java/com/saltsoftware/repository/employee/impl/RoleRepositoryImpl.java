/*
package com.saltsoftware.repository.employee.impl;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.repository.employee.RoleRepository;



import java.util.HashSet;
import java.util.Set;

*/
/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Create Role Repository
 *//*

@Deprecated
public class RoleRepositoryImpl implements RoleRepository {

    private static RoleRepository RoleRepository = null;
    private Set<Role> roleDB;

    public RoleRepositoryImpl(){
        this.roleDB = new HashSet<>();
    }

    public static RoleRepository getRoleRepository() {
        if(RoleRepository == null)
            RoleRepository =  new RoleRepositoryImpl();
        return RoleRepository;
    }

    //Role Doctor, Receptionist...

    public Role create(Role role) {
        this.roleDB.add(role);
        return role;
    }
// read role
    public Role read(String RoleID){
        Role role = null;
        for (Role r: this.roleDB){
            if (r.getRoleID().equalsIgnoreCase(RoleID)) {
                role = r;
                break;

            }
        }
        return role;
    }

    //update existing Role
    public Role update(Role role){
        Role oldRole = read(role.getRoleID());

        if (oldRole != null){
            this.roleDB.remove(oldRole);
            this.roleDB.add(role);
        }
        //update
        return role;
    }

    //delete role
    public boolean delete(String roleID){
        Role Role = read(roleID);
        if (Role != null);
        this.roleDB.remove(Role);

        return false;
    }
//GetAll
    @Override
    public Set<Role> getAll() {
        return this.roleDB;
    }
}

*/
