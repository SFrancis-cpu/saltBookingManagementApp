package com.saltsoftware.repository.dentalService.impl;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.dentalService.CostRepository;

import java.util.HashSet;
import java.util.*;


/* @Author: Junade Frizlar
 *   StudentNumber : 208046402
 *   This is a cost repository.
 * */

public class CostRepositoryImpl implements CostRepository {
    private Set<Cost>CostDB;
    //Constructor
    public CostRepositoryImpl(){
        this.CostDB = new HashSet<>();
    }

    // This method creates cost
    @Override
    public Cost create(Cost cost) {
        this.CostDB.add(cost);
        return cost;
    }

    //This method reads from Cost database
    @Override
    public Set<Cost> read(String CostID) {
        Cost cost = null;
        for(Cost c : this.CostDB){
            if(c.getCostID().equalsIgnoreCase(costId)){
                cost = c;
                break;
            }
        }
        return cost;

        public Cost update(Cost cost) {
            Cost oldCost = read(cost.getCostID());
            if(oldCost != null){
                this.CostDB.remove(oldCost);
                this.CostDB.add(cost);
            }
            return cost;
        }

            //This method removes and cost object
        public void delete(String CostID) {
            Cost cost = read(CostID);
            if(cost != null);
            this.CostDB.remove(cost);

        }
        @Override
        public Set<Cost> getAll() {
            return this.CostDB;
        }
    }

