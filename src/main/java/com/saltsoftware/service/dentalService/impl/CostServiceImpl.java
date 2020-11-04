package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.service.dentalService.impl.CostServiceImpl;
import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.dentalService.CostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 * @author name: Junade Frizlar
 * student number: 208046402
 **/
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CostServiceImpl implements CostService {

    private static CostService service = null;
    @Autowired
    private CostRepository repository;


    public Set<Cost> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    public Cost create(Cost cost) {
        return this.repository.save(cost);
    }

    public Cost read(String s) {
        return this.repository.findById(s).orElseGet(null);

    }

    public Cost update(Cost cost) {
        return this.repository.save(cost);
    }

    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (this.repository.existsById(s)) return false;
        else return true;
    }
}