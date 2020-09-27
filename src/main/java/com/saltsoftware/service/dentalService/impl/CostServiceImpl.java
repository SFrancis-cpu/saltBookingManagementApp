package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.dentalService.CostRepository;
import com.saltsoftware.repository.dentalService.impl.CostRepositoryImpl;
import com.saltsoftware.service.dentalService.CostService;
import org.springframework.stereotype.Service;
/*
 * @author name: Junade Frizlar
 * student number: 208046402
 **/
import java.util.Set;

@Service
public class CostServiceImpl implements CostService {

    private static CostService service = null;
    private CostRepository repository;

    public CostServiceImpl(){
        this.repository = CostRepositoryImpl.getCostRepository();
    }

    public static CostService getService(){
        if(service == null)
            service =  new com.saltsoftware.service.dentalService.impl.CostServiceImpl();
        return service;

    }

    public Set<Cost> getAll() {
        return this.repository.getAll();
    }

    public Cost create(Cost cost) {
        return this.repository.create(cost);
    }

    public Cost read(String s) {
        return this.repository.read(s);
    }

    public Cost update(Cost cost) {
        return this.repository.update(cost);
    }

    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}

