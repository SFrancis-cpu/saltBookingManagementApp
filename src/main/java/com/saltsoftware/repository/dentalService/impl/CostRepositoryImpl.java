package com.saltsoftware.repository.dentalService.impl;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.dentalService.CostRepository;


import java.util.HashSet;
import java.util.Set;
/**
 * Created by :Junade Frizlar
 * Student no: 208046402
 * Desc: Create Cost Repository
 */

public class CostRepositoryImpl implements CostRepository {
    private Set<Cost>CostDB;

    //Constructor
    public CostRepositoryImpl(){
        this.CostDB = new HashSet<>();
    }

    public static CostRepository getCostRepository(){
        CostRepositoryImpl costRepository = null;
        if(costRepository == null)
            costRepository = new CostRepositoryImpl();
        return costRepository;
    }


    // This method creates a cost
    @Override
    public Cost create(Cost cost) {
        this.CostDB.add(cost);
        return cost;
    }
    //This method reads from cost database
    @Override
    public Cost read(String empId) {
        Cost cost = null;
        for(Cost c: this.CostDB){
            if(c.getCostID().equalsIgnoreCase(cost.costID)){
                cost = c;
                break;
            }
        }
        return cost;
    }

    //This method updates an existing cost
    public Cost update(Cost cost) {
        Cost oldCost = read(cost.getCostID());
        if(oldCost != null){
            this.CostDB.remove(oldCost);
            this.CostDB.add(cost);
        }
        return cost;
    }

    //This method removes and cost object
    public boolean delete(String CostID) {
        Cost cost = read(CostID);
        if(cost != null);
        this.CostDB.remove(cost);

        return false;
    }
    @Override
    public Set<Cost> getAll() {
        return this.CostDB;
    }
}

