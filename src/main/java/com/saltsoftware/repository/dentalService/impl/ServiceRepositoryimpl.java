package com.saltsoftware.repository.dentalService.impl;

/*
 * Author: Abram Rakgotho
 * Student Number: 215031393
 * Created Repository for service entity under the package name dental service
 */

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.factory.dentalService.ServiceFactory;
import com.saltsoftware.repository.Repository;
import com.saltsoftware.repository.dentalService.ServiceRepository;
import com.saltsoftware.repository.employee.EmployeeRoleRepository;
import com.saltsoftware.repository.employee.impl.EmployeeRoleRepositoryImpl;


import java.util.HashSet;
import java.util.Set;

public class ServiceRepositoryimpl implements ServiceRepository {


    // manipulating database to create, read, update and delete

    private final Set<Service> serviceDB;

    public ServiceRepositoryimpl()
    {
        this.serviceDB = new HashSet<>();
    }


   //creating a local variable that references the Service class where it
    //will get stored in the out service database
    public Service create(Service service)
    {
        this.serviceDB.add(service);
        return service;

    }
    public Service read(String serviceId)
    {
        //The for loop will access all functionalities in the database to display the required value specified
        //by the if statement.
        Service service = null;
        for(Service ser:this.serviceDB)
        {
            if(ser.getServiceId().equalsIgnoreCase(serviceId))
            {
                service = ser;
                break;
            }

        }
        return service;

    }
    public Service update(Service service)
    {   //Creating an object
        //Updating the database
        Service previousService = read(service.getServiceId());
        if(previousService != null)
        {
        this.serviceDB.remove(previousService);
        this.serviceDB.add(service);

        }
        return service;

    }
    //Removing what the database has recorded based on what has been specified
    public void delete(String serviceId)
    {
        Service service = read(serviceId);
        if(service != null)
        {
            this.serviceDB.remove(service);
        }



    }

    @Override
    public Set<Service> getAll() {
        return this.serviceDB;
    }
}
