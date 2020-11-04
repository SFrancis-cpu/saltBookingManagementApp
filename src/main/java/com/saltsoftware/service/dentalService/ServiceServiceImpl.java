package com.saltsoftware.service.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.repository.dentalService.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

/*
 *@Author: Abram Rakgotho
 * Student Number: 215031393
 * Group: Part time
 * Role passed: Created ServiceService implementation that implements the local interface ServiceService
 */
@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {


    //

    @Autowired
    private static ServiceService service = null;
    private  ServiceRepository sRepository;



    @Override
    public Set<Service> getAll()
    {
        return this.sRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Service create(Service service) {
        return this.sRepository.save(service);
    }

    @Override
    public Service read(String service)
    {
        return this.sRepository.findById(service).orElse(null);
    }

    @Override
    public Service update(Service service) {
        return this.sRepository.save(service);
    }

    @Override
    public boolean delete(String service) {
        this.sRepository.deleteById(service);
        if(this.sRepository.existsById(service))
        {

            return false;
        }else
         return true;
    }

}
