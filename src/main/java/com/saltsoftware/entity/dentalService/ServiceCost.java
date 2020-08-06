package com.saltsoftware.entity.dentalService;
/* @Author: Lebusa
*   Stud# : 216059186
*   Class Desc: This is a service cost entity class which operates as a link between Service entity and the Cost entity
*   Date: 7 Jul 2020
* */

public class ServiceCost {

    private String costID, serviceID;

    private ServiceCost(Builder builder) {

        this.costID = builder.costID;

        this.serviceID = builder.serviceID;

    }

    public String getCostID() {
        return costID;
    }

    public String getServiceID() {
        return serviceID;
    }

    @Override
    public String toString() {
        return "ServiceCost{" +
                "costID='" + costID + '\'' +
                ", serviceID='" + serviceID + '\'' +
                '}';
    }

    public static class Builder {

        private String costID, serviceID;

        public Builder setCostID(String costID) {
            this.costID = costID;
            return this;
        }

        public Builder setServiceID(String serviceID) {
            this.serviceID = serviceID;
            return this;
        }

        public Builder copy(ServiceCost serviceCost){

            this.costID = serviceCost.costID;

            this.serviceID = serviceCost.serviceID;

            return this;
        }

        public ServiceCost build(){

         return new ServiceCost(this);
        }

    }

}


