package com.saltsoftware.factory.dentalService;


import com.saltsoftware.entity.dentalService.ServiceCost;
import org.junit.Assert;
import org.junit.Test;
/*
 *
 * @author Lebusa.Letsoha
 * Student#: 216059186
 * Class Desc: Test class  for the ServiceCost class
 * Date: 14 Jul 2020

 */

public class ServiceCostFactoryTest {

    @Test
    public void buildEmployeeGender() {
        ServiceCost serviceCost = ServiceCostFactory.buildServiceCost("VIP_01", "0110");
        String service_id = "VIP_02";

        System.out.println(serviceCost);

        Assert.assertEquals(service_id,serviceCost.getServiceId());
        Assert.assertNotNull(serviceCost);
    }


}
