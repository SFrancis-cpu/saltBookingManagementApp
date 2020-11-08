package com.saltsoftware.factory.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.util.GenericHelper;
/*
* Author: Abram Rakgotho
* Student Number: 215031393
*Role: responsible for creating a factory to build my entity

 */

public class ServiceFactory {

    public static Service createService(String sName, String sDescription)
    {

        String ServiceId = GenericHelper.generateID();
        Service Service = new Service.Builder()
                .setServiceDescrip(sDescription)
                .setServiceName(sName)
                .setServiceId(ServiceId)
                .build();
        return Service;

    }


}
