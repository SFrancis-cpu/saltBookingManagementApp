package com.saltsoftware.factory;

import junit.framework.TestCase;
import com.saltsoftware.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

/**
 * created by: Abduragmaan Frank
 * student no: 217009069
 * Desc: Test case for Employee Factory
 */

public class EmployeeFactoryTest extends TestCase {

    //Test for object Identity and Equality
@Test
    public void testCreateEmployee() {
        Employee emp1 = EmployeeFactory.createEmployee("Abduragmaan","Frank");
        Employee emp2 = EmployeeFactory.createEmployee("Adeeb","Gamieldien");
        assertSame(emp1.getEmpName(),emp2.getEmpName());
        assertEquals(emp1.getEmpId(),emp2.getEmpId());
    }

    @Test
    public static void fail(){
        Assert.fail();
        System.out.println();

    }
}