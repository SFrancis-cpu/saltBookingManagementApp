package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.repository.dentalService.ServiceCostRepository;
import com.saltsoftware.repository.dentalService.impl.ServiceCostRepositoryImpl;
import com.saltsoftware.service.dentalService.ServiceCostService;
import org.springframework.stereotype.Service;

import java.util.Set;

/*
        Author: Lebusa Letsoha
        Description: The class implements interface ServiceCostService interface to achieve the highest level of abstraction
        Date: 07-Sep-2020
 */
@Service
public class ServiceCostServiceImpl implements ServiceCostService {

    private static ServiceCostService service = null;
    private ServiceCostRepository repository;

    public ServiceCostServiceImpl ()
    {
        this.repository = ServiceCostRepositoryImpl.getRepository();
    }

    public static ServiceCostService getService(){
        if (service == null) service = new ServiceCostServiceImpl();
        return service;
    }

    @Override
    public Set<ServiceCost> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ServiceCost create(ServiceCost serviceCost) {
        return this.repository.create(serviceCost);
    }

    @Override
    public ServiceCost read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ServiceCost update(ServiceCost serviceCost) {
        return this.repository.update(serviceCost);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

}
