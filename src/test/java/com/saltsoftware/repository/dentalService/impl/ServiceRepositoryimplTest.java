package com.saltsoftware.repository.dentalService.impl;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.factory.dentalService.ServiceFactory;
import com.saltsoftware.repository.dentalService.ServiceRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ServiceRepositoryimplTest {

    private static ServiceRepository repo = new ServiceRepositoryimpl();
    private static Service service = ServiceFactory.createService("Dentistry", "teeth alignment");

    @Test
    public void a_create()
    {
        Service created = repo.create(service);
        assertEquals(service.getServiceId(), created.getServiceId());
        System.out.println("Created:"+" "+created);
    }

    @Test
    public void b_read()
    {
        Service read = repo.read(service.getServiceId() );
        //Need to work on this
        assertEquals(service.getServiceId(), read.getServiceId());
        System.out.println("Read:"+" " +read);
    }


    @Test
    public void c_update()
    {
        Service updated = new Service.Builder().copy(service).setServiceName("Dentist")
                .setServiceDescrip("Teeth removal").build();
        updated = repo.update(updated);
        //assertNotEquals(service.getServiceId(), updated.getServiceId());
        System.out.println("updated:"+" "+updated);
    }

    @Test
    public void e_delete()
    {
        repo.delete(service.getServiceId());
    }

    @Test
    public void d_getAll()
    {
        Set<Service> service = repo.getAll();
        System.out.println(repo.getAll());
        assertEquals(1, service.size());
    }
}