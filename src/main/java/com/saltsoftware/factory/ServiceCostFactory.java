package com.saltsoftware.factory;

/**
 * @author Lebusa.Letsoha
 * Student#: 216059186
 * Class desc: Create ServiceCost Factory to instatiate the ServiceCost builder class
 * Date: 14 Jul 2020
 */

import com.saltsoftware.entity.ServiceCost;
import com.saltsoftware.util.GenericHelper;

public class ServiceCostFactory {
    public static ServiceCost createServiceCost()
    {
        String costID = GenericHelper.generateID();
        String serviceID = GenericHelper.generateID();

        ServiceCost serviceCost = new ServiceCost.Builder()
                .setCostID(costID)
                .setServiceID(serviceID)
                .build();
        return serviceCost;
    }
}
