package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.repository.dentalService.ServiceCostRepository;
import com.saltsoftware.repository.dentalService.impl.ServiceCostRepositoryImpl;
import com.saltsoftware.service.dentalService.ServiceCostService;
import com.saltsoftware.repository.dentalService.ServiceCostRepository;


import java.util.HashSet;
import java.util.Set;

public class ServiceCostServiceImpl implements ServiceCostService {

    private static ServiceCostRepository repository = null;
    private Set<ServiceCost> serviceCostDB;

    private ServiceCostServiceImpl(){
        this.serviceCostDB = new HashSet<>();
    }

    public static ServiceCostRepository getRepository(){
        if (repository == null) repository = new ServiceCostRepositoryImpl();
        return repository;
    }

    // return all object in the database records
    @Override
    public Set<ServiceCost> getAll() {
        return this.serviceCostDB;
    }

    //Responsible for the record creation and writing to the DB
    @Override
    public ServiceCost create(ServiceCost serviceCost) {
        this.serviceCostDB.add(serviceCost);
        return serviceCost;
    }

    // Read from the database and return the instance of ServiceCost
    @Override
    public ServiceCost read(String id) {

        for (ServiceCost serviceCost : this.serviceCostDB)
        {
            if(serviceCost.getServiceId().equalsIgnoreCase(id))
                return serviceCost;
        }
        return null;
    }

    // Search function when doing a database query
    private ServiceCost search(String id){
        for(ServiceCost serviceCost: serviceCostDB){
            if(serviceCost.getServiceId().equals(id)){
                return serviceCost;
            }
        }
        return null;
    }

    // Responsible for updating the existing record in the database and return the instance of ServiceCost
    @Override
    public ServiceCost update(ServiceCost serviceCost) {
        ServiceCost toDelete = search(serviceCost.getServiceId());
        if (toDelete != null){
            this.serviceCostDB.remove(toDelete);
            return create(serviceCost);
        }
        return null;
    }
    // Method to remove the record from the DB
    @Override
    public boolean delete(String s) {
        ServiceCost toDelete = read(s);
        if (toDelete != null) {
            this.serviceCostDB.remove(toDelete);
        }
        return false;
    }

}
