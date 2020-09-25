package com.saltsoftware.entity.dentalService;

import java.io.Serializable;

/* @Author : Abram Rakhotho
*  Stud#:215031393
* This is the service account responsible for creating and deleting services provided.
*/
public class Service implements Serializable
{
    private String serviceName;
    private String serviceDescrip;
    private String serviceId;

    public Service(){}

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceDescrip() {
        return serviceDescrip;
    }

    public String getServiceId() {
        return serviceId;
    }

    @Override
    public String toString() {
        return "Services{" +
                "ServiceName='" + serviceName + '\'' +
                ", ServiceDescrip='" + serviceDescrip + '\'' +
                ", ServiceId='" + serviceId + '\'' +
                '}';
    }

    private Service(Builder builder)
    {
        this.serviceName = builder.serviceName;
        this.serviceDescrip = builder.serviceDescrip;
        this.serviceId = builder.serviceId;


    }
    public static class Builder
    {

        private String serviceName;
        private String serviceDescrip;
        private String serviceId;

        public Builder setServiceName(String ServiceName)
        {
            this.serviceName = ServiceName;
            return this;
        }
        public Builder setServiceDescrip(String ServiceDescrip)
        {
            this.serviceDescrip = ServiceDescrip;
            return this;
        }
        public Builder setServiceId(String ServiceId)
        {
            this.serviceId = ServiceId;
            return this;
        }
        public Builder copy(Service service)
        {
            this.serviceName = service.serviceName;
            this.serviceDescrip = service.serviceDescrip;
            this.serviceId = service.serviceId;
            return this;

        }

        public Service build()
        {
            return new Service(this);
        }



    }
    //Methods
    public void createService()
    {


    }
    public void deleteService()
    {


    }



}
