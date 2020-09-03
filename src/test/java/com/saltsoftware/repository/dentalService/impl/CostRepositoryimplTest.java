package com.saltsoftware.repository.dentalService.impl;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.factory.dentalService.CostFactory;
import com.saltsoftware.repository.dentalService.CostRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Created by :Junade Frizlar
 * Student no: 208046402
 * Desc: Create test class for  CostRepositoryImpl
 * This is my test class
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class CostRepositoryImplTest {

    private static CostRepository Repository = new CostRepositoryImpl();
    private static Cost cost = CostFactory.createCost("47859654", Double.parseDouble("40"));


    //Test case for create method
    @Test
    public void a_testCreate() {
        Cost created =Repository.create(cost);
        Assert.assertEquals(cost.getCostID(), created.getCostID());
        System.out.println("created: "+ created);
    }

    //Test case for read method
    @Test
    public void b_testRead() {
        Cost read = Repository.read(cost.getCostID());
        Assert.assertEquals(cost.getCostID(),read.getCostID());
        System.out.println("Read : " +read);
    }



    //Test case for delete method
    @Test
    public void e_testDelete() {
        Repository.delete(cost.getCostID());

    }
}