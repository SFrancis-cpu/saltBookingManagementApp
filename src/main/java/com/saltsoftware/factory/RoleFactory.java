package com.saltsoftware.factory;
/* @author: Noluthando Nqwelo
/* @std no: 215029003
/* @description: Creating role factory

 */

import com.saltsoftware.entity.Role;
import com.saltsoftware.util.GenericHelper;

    public class RoleFactory {

        public static Role createRole(String roleID, String roleDesc) {
            roleID = GenericHelper.generateID();
            Role role = new Role.Builder()
                    .setRoleID(roleID)
                    .setRoleDesc(roleDesc)
                    .build();
            return role;

        }
    }


