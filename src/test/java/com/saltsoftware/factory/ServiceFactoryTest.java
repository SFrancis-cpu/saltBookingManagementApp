package com.saltsoftware.factory;
/*
*@Author: Abram Rakgotho
*Student Number: 215031393
* Created a test case to test the Service factory class
 */

import com.saltsoftware.entity.Service;
import com.sun.org.apache.xerces.internal.xs.datatypes.XSQName;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceFactoryTest {

    @Test
    public void createService()
    {
        Service sr = ServiceFactory.createService("Teeth", "Teeth removal", "identity");

        //perfoming equality test

        assertEquals(sr.getServiceName(),sr.getServiceName());

    }
    @Test
    public void identify()
    {
        Service id = ServiceFactory.createService("teeth","teeth removal","identity");
        assertEquals( id.getServiceName(), id.getServiceDescrip(), id.getServiceId());


    }

    //@Ignore
    //When the time passes the recommeded time, the program will sleep
    @Test (timeout = 500)
    public void timeOut() throws InterruptedException {
        while (true) {
            Thread.currentThread().sleep(1000);

        }


    }
}