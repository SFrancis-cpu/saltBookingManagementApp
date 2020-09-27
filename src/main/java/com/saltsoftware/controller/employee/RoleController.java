package com.saltsoftware.controller.employee;

import com.saltsoftware.entity.employee.Role;
import com.saltsoftware.factory.employee.RoleFactory;
import com.saltsoftware.service.employee.impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/* @author - Noluthando Nqwelo
/* @std no - 215029003
/* @Description - Creating Role Controller
 */

@RequestMapping("/role")
@RestController
public class RoleController {


    @Autowired
    private RoleServiceImpl RoleService;

    //creating role
    @PostMapping("/create")
    public Role create(@RequestBody Role role) {
        Role newRole = RoleFactory.createRole(role.getRoleDesc());
        return RoleService.create(newRole);
    }

    //reading role
    @GetMapping("/read/{id}")
    public Role read(@PathVariable String id){
    return RoleService.read(id);
}
//updating role
   @PostMapping("/update")
    public Role update(@RequestBody Role role){
    return RoleService.update(role);
}
//deleting role
   @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return RoleService.delete(id);
    }

    //getting all
   @GetMapping("/all")
    public Set<Role> getAll() {
    return RoleService.getAll();
}
}



