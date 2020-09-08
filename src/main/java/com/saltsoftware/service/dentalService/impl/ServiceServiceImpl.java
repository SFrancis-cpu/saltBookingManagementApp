package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.repository.dentalService.ServiceRepository;
import com.saltsoftware.repository.dentalService.impl.ServiceRepositoryimpl;
import com.saltsoftware.service.dentalService.ServiceService;
import java.util.Set;

/*
 *@Author: Abram Rakgotho
 * Student Number: 215031393
 * Group: Part time
 * Role passed: Created ServiceService implementation that implements the local interface ServiceService
 */

public class ServiceServiceImpl implements ServiceService {


    //
    private static ServiceService service = null;
    private  ServiceRepository sRepository;

    private ServiceServiceImpl()
    {
        this.sRepository = ServiceRepositoryimpl.getServiceRepository();
    }
    public static ServiceService getService()
    {
        if(service  == null)
            service = new ServiceServiceImpl();

        return service;
    }

    @Override
    public Set<Service> getAll() {
        return this.sRepository.getAll();
    }

    @Override
    public Service create(Service service) {
        return this.sRepository.create(service);
    }

    @Override
    public Service read(String s) {
        return this.sRepository.read(s);
    }

    @Override
    public Service update(Service service) {
        return this.sRepository.update(service);
    }

    @Override
    public boolean delete(String s) {
        return this.sRepository.delete(s);
    }
}
