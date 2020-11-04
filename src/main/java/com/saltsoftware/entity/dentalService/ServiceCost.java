package com.saltsoftware.entity.dentalService;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Objects;


/* @Author: Lebusa
 *   Stud# : 216059186
 *   Class Desc: This is a service cost entity class which operates as a link between Service entity and the Cost entity
 *   Date: 7 Jul 2020
 * */

@Entity
@IdClass(ServiceCostId.class)

public class ServiceCost {

    @Id
    private String costId, serviceId;
    private String serviceIdDesc;

    protected ServiceCost(){}

    private ServiceCost(Builder builder) {

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return costId.equals(builder.costId) &&
                    serviceId.equals(builder.serviceId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(costId, serviceId);
        }
    }

}


