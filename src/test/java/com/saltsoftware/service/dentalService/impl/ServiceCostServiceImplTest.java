/*
package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
import com.saltsoftware.repository.dentalService.impl.ServiceCostRepositoryImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

*/
/*
        Author: Lebusa Letsoha
        Description: This is a test class for the ServiceCostServiceImpl class
        Date: 07-Sep-2020
 *//*


import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ServiceCostServiceImplTest {

    private static ServiceCostRepository repository = ServiceCostRepositoryImpl.getRepository();
    private static ServiceCost serviceCost = ServiceCostFactory.buildServiceCost("VIP_01", "0102");

    @Test
    public void a_create() {
        ServiceCost created = repository.create(serviceCost);
        //Assert.assertNotEquals(serviceCost.getCostId(), created.getServiceId());
        Assert.assertNotEquals(serviceCost.getServiceId(), created.getCostId());
        System.out.println("Created : " + created);
    }

    @Test
    public void b_read() {
        ServiceCost read = repository.read(serviceCost.getServiceId());
        System.out.println("Read :" + read);
    }

    @Test
    public void c_update() {
        ServiceCost updated = new ServiceCost.Builder().copy(serviceCost).serviceId("VIP_01").build();
        updated = repository.update(updated);
        System.out.println("Record updated:"+ updated);
    }
    @Test
    public void e_delete() {
        repository.delete(serviceCost.getServiceId());
    }

    @Test
    public void d_getAll() {
        Set<ServiceCost> serviceCosts = repository.getAll();
        assertEquals(1, serviceCosts.size());
        System.out.println(repository.getAll());
    }
}*/
