package com.saltsoftware.factory.dentalService;


import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
import org.junit.Test;

/**
 * @author Lebusa.Letsoha
 * Student#: 216059186
 * Class Desc: Test class  for the Serice class
 * Date: 14 Jul 2020
 */

import static org.junit.Assert.*;

public class ServiceCostFactoryTest {


    @Test
    public void testCreateServiceCost() {

        ServiceCost servCst_One = ServiceCostFactory.createServiceCost();
        ServiceCost servCst_Two = ServiceCostFactory.createServiceCost();

        // testing for equality
        assertSame(servCst_One.getServiceID(), servCst_Two.getServiceID());
    }

}