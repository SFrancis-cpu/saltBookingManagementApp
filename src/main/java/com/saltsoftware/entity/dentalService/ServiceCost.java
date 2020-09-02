package com.saltsoftware.entity.dentalService;

import java.util.Objects;


/* @Author: Lebusa
 *   Stud# : 216059186
 *   Class Desc: This is a service cost entity class which operates as a link between Service entity and the Cost entity
 *   Date: 7 Jul 2020
 * */


public class ServiceCost {

    private String costId, serviceId;

    public ServiceCost(Builder builder) {

        this.costId = builder.costId;

        this.serviceId = builder.serviceId;
    }

    public String getCostId() {
        return costId;
    }

    public String getServiceId() {
        return serviceId;
    }


    public static class Builder {

        String costId, serviceId;

        public Builder serviceId(String serviceId){
            this.serviceId = serviceId;
            return this;
        }

        public Builder costId(String costId){
            this.costId = costId;
            return this;
        }

        public Builder copy(ServiceCost serviceCost){

            this.costId = serviceCost.costId;

            this.serviceId = serviceCost.serviceId;

            return this;
        }

        public ServiceCost build(){

            return new ServiceCost(this);
        }

        @Override
        public String toString() {
            return "ServiceCost{" +
                    "costID='" + costId + '\'' +
                    ", serviceID='" + serviceId + '\'' +
                    '}';
        }

    }

}


