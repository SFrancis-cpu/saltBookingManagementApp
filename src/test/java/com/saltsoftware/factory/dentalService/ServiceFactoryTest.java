package com.saltsoftware.factory.dentalService;
/*
*@Author: Abram Rakgotho
*Student Number: 215031393
* Created a test case to test the Service factory class
 */

import com.saltsoftware.entity.dentalService.Service;
//import com.sun.org.apache.xerces.internal.xs.datatypes.XSQName;
import com.saltsoftware.factory.dentalService.ServiceFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceFactoryTest {

    @Test
    public void createService()
    {
        Service sr = ServiceFactory.createService("Teeth", "Teeth removal");

        //perfoming equality test

        assertEquals(sr.getServiceName(),sr.getServiceName());
        assertEquals(sr.getServiceDescrip(),sr.getServiceDescrip());


    }
    @Test
    public void identify()
    {
        Service id = ServiceFactory.createService("teeth","teeth removal");
        assertSame(id.getServiceId(), id.getServiceDescrip(), id.getServiceName());


    }
    //When the time passes the recommeded time, the program will sleep
    @Ignore
    @Test (timeout = 500)
    public void timeOut() throws InterruptedException {
        while (true) {
            Thread.currentThread().sleep(1000);

        }


    }
}