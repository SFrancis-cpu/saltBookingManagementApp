package com.saltsoftware.factory;
/*
*@Author: Abram Rakgotho
*Student Number: 215031393
*Created a factory class
 */


import com.saltsoftware.entity.Service;
import com.saltsoftware.util.GenericHelper;

public class ServiceFactory
{

    public static Service createService(String sName, String sDescription, String serviceId)
    {



        serviceId = GenericHelper.generateID();
        Service service = new Service.Builder()
                .setServiceDescrip(sDescription)
                .setServiceName(sName)
                .setServiceId(serviceId)
                .build();

        return service;




    }

}
