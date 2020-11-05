package com.saltsoftware.factory.dentalService;

/*
 *
 * @author Lebusa.Letsoha
 * Student#: 216059186
 * Class desc: Create ServiceCost Factory to instantiate the ServiceCost builder class, takes in serviceID and CostID
 * Date: 14 Jul 2020

 */


import com.saltsoftware.entity.dentalService.ServiceCost;

public class ServiceCostFactory {

    public static ServiceCost buildServiceCost(String serviceId, String costId) {
        return new ServiceCost.Builder()
                .serviceId(serviceId)
                .costId(costId)
                .build();
    }

}
