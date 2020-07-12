package com.saltsoftware.factory;

import junit.framework.TestCase;
import com.saltsoftware.entity.Cost;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by: Abduragmaan Frank
 * student no: 217009069
 * Desc: Test case for Employee Factory
 */

public class EmployeeFactoryTest extends TestCase {

    @Before
    public void setUp(){
        Employee emp1 = EmployeeFactory.createEmployee("Abduragmaan","Frank");

    }


    //Test for object Identity and Equality
    @Test
    public void testCreateEmployee() {
        Employee emp1 = EmployeeFactory.createEmployee("Abduragmaan","Frank");
        Employee emp2 = EmployeeFactory.createEmployee("Adeeb","Gamieldien");

        //Identity test
        assertSame(emp1.getEmpName(),emp1.getEmpName());

        //Equality test
        assertEquals(emp1.getEmpId(),emp2.getEmpId());
    }

    @Test
    public void testempLastName(){
    //Equality test on Employee Last name
    Employee emp1 = EmployeeFactory.createEmployee("Abduragmaan","Frank");
    assertEquals("Frank", emp1.getEmpLastName());
    }

    @Test
    public void testfail(){
        Assert.fail();
        System.out.println();

    }
}