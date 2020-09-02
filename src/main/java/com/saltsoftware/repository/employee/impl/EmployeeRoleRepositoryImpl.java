/*create, read, update and delete

    EmployeeRole is an internal report that is created when a new employee is
    assigned to a specific role example "Receptionist / Dentist" etc. or an
    existing employee is updated to a new role, or viewing the specific EmployeeRole,
    Or the role has become obsolete therefore deleting the EmployeeRole.
    A specific employee has a specific role. the person must provide an empID in order to update or delete and EmployeeRole

 */

package com.saltsoftware.repository.employee.impl;

/*   @Author: Sakeena Francis
 *   StudentNumber : 215006097
 *   This is a EmployeeRole repository responsible for create, read, update and delete EmployeeRoles
 *   Date: 18-07-2020
 * */

import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.repository.employee.EmployeeRoleRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRoleRepositoryImpl implements EmployeeRoleRepository {

    private Set<EmployeeRole> employeeRoleDB;
    private static EmployeeRoleRepository employeeRoleRepository = null;

    public EmployeeRoleRepositoryImpl(){
        this.employeeRoleDB = new HashSet<>();
    }

    public static EmployeeRoleRepository getEmployeeRoleRepository(){
        if (employeeRoleRepository == null)

            employeeRoleRepository = new EmployeeRoleRepositoryImpl();
        return employeeRoleRepository;
    }

    public EmployeeRole create(EmployeeRole employeeRole){
        this.employeeRoleDB.add(employeeRole);
        return employeeRole;
    }

    public EmployeeRole read(String empID){
        EmployeeRole employeeRole = null;
        for (EmployeeRole er : this.employeeRoleDB){
            if (er.getEmpID().equalsIgnoreCase(empID)) {
                employeeRole = er;
                break;
            }
        }
        return employeeRole;
    }

    //this method updates an existing employeeRole
    public EmployeeRole update(EmployeeRole employeeRole){
        //get the object
        EmployeeRole oldEmployeeRole = read(employeeRole.getEmpID());

        if (oldEmployeeRole != null){
            this.employeeRoleDB.remove(oldEmployeeRole);
            this.employeeRoleDB.add(employeeRole);
        }
        //and then update it
        return employeeRole;
    }

    //this method deletes an internal record : EmployeeRole
    public void delete(String empID){
        EmployeeRole employeeRole = read(empID);
        if (employeeRole != null);
            this.employeeRoleDB.remove(employeeRole);

    }

    @Override
    public Set<EmployeeRole> getAll() {
        return this.employeeRoleDB;
    }
}
