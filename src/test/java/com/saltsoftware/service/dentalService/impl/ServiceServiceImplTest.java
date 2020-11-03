/*
package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.factory.dentalService.ServiceFactory;
import com.saltsoftware.service.dentalService.ServiceService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;
*/
/*
 *@Author: Abram Rakgotho
 * Student Number: 215031393
 * Group: Part time
 * Role passed: Created ServiceService testing

 *//*


import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ServiceServiceImplTest {

    private static ServiceService service = ServiceServiceImpl.getService();
    private static Service ser = ServiceFactory.createService("Dentistry", "teeth alignment");

    //Get all functionalities of service
    @Test
    public void d_getAll()
    {
        Set<Service> s = service.getAll();
        assertEquals(1 , s.size());
        System.out.println("Service"+s);
    }
    //Inputing data into the Db
    @Test
    public void a_create()
    {
        Service created = service.create(ser);
        assertEquals(ser.getServiceId(), created.getServiceId());
        System.out.println("Created:"+" "+created);

    }
    //Read the build up to service entity
    @Test
    public void b_read()
    {
        Service read = service.read(ser.getServiceId() );
        assertEquals(ser.getServiceId(), read.getServiceId());
        System.out.println("Read:"+" " +read);
    }

    //Updating the data passed to the DB(serviceDB)

    @Test
    public void c_update()
    {
        Service updated = new Service.Builder().copy(ser).setServiceName("Dentist")
                .setServiceDescrip("Teeth removal").build();
        updated = service.update(updated);
        System.out.println("updated:"+" "+updated);
    }
    //Deleting service functionalities of service object
    @Test
    public void e_delete()
    {
       service.delete(ser.getServiceId());
        //Assert.assertTrue(deleted);
    }
}*/
