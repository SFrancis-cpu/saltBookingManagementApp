package com.saltsoftware.factory;

import com.saltsoftware.entity.Cost;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * @author name: Junade Frizlar
 * student number: 208046402
 * Description: creating a Test Case for CostFactory
 * date: 12 July 2020
 **/
public class CostFactoryTest {

    @Before
    public void setUp(){
        Cost c = CostFactory.createCost("a1b2", 20.50);
    }

    @After
    public void tearDown() throws Exception {
    }
    //Test for object Identity and Equality
    @Test
    public void createCost() {
        Cost p1 = CostFactory.createCost("a1b2", 20.50);
        Cost p2 = CostFactory.createCost("a1b2", 20.50);

        //Identity test
        assertSame(p1.getCostID(), p1.getCostID());
        assertSame(p2.getAmount(), p2.getAmount());

        //Equality test
        assertEquals(p1.getCostID(), p2.getCostID());
        assertEquals(p1.getAmount(), p2.getAmount());
    }
    @Test
    public void testCostID() {
        //A equality test for costID

        Cost p1 = CostFactory.createCost("a1b2", 20.50);
        assertEquals("a1b2", p1.getCostID());
    }
    @Test
    public void testAmount() {
        //A equality test for amount
        Cost p1 = CostFactory.createCost("a1b2", 20.50);
        assertEquals(20.50, p1.getAmount(),22.45);
    }
}