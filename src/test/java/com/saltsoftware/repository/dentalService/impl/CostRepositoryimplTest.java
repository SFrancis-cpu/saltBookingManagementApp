package com.saltsoftware.repository.dentalService.impl;

import com.saltsoftware.entity.cost;
import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.Repository;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
/**
        * Created by :Junade Frizlar
        * Student no: 208046402
        * Desc: Create test class for  CostRepositoryImpl
 */
public class CostRepositoryimplTest {

    //Test case for create method
    @Test
    public void a_testCreate() {
        Cost created = Repository.create(cost);
        assertEquals(cost.getCostID(), created.getAmount());
        System.out.println("created: "+ created);
    }
    //Test case for read method
    @Test
    public void b_testRead() {
        Cost read = Repository.read(cost.getCostID());
        assertEquals(cost.getCostID(),read.getCostID());
        System.out.println("Read : " +read);
    }
    //Test case for update method
    @Test
    public void c_testUpdate() {
        Cost updated = new Cost.Builder().copy(cost).setAmount(10).build();
        Repository.update(updated);
        assertNotEquals(cost.getAmount(), updated.getAmount());
        System.out.println("updated: " + updated);

    }
    //Test case for delete method
    @Test
    public void e_testDelete() {
        Repository.delete(cost.getCostID());

    }
    //Test case for getAll method
    @Test
    public void d_testGetAll() {
        Set<Cost> cost = Repository.getall();
        assertEquals(1,cost.size());
        System.out.println(Repository.getall());
    }
}
