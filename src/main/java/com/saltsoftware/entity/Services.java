package com.saltsoftware.entity;
/* @Author : Abram Rakhotho
*  Stud#:215031393
* This is the service account responsible for creating and deleting services provided.
*/
public class Services
{
    private String ServiceName;
    private String ServiceDescrip;
    private String ServiceId;

    public String getServiceName() {
        return ServiceName;
    }

    public String getServiceDescrip() {
        return ServiceDescrip;
    }

    public String getServiceId() {
        return ServiceId;
    }

    @Override
    public String toString() {
        return "Services{" +
                "ServiceName='" + ServiceName + '\'' +
                ", ServiceDescrip='" + ServiceDescrip + '\'' +
                ", ServiceId='" + ServiceId + '\'' +
                '}';
    }

    private Services(Builder builder)
    {
        this.ServiceName = builder.ServiceName;
        this.ServiceDescrip = builder.ServiceDescrip;
        this.ServiceId = builder.ServiceId;


    }
    //builder
    public static class Builder
    {

        private String ServiceName;
        private String ServiceDescrip;
        private String ServiceId;

        public Builder setServiceName(String ServiceName)
        {
            this.ServiceName = ServiceName;
            return this;
        }
        public Builder setServiceDescrip(String ServiceDescrip)
        {
            this.ServiceDescrip = ServiceDescrip;
            return this;
        }
        public Builder setServiceId(String ServiceId)
        {
            this.ServiceId = ServiceId;
            return this;
        }
        public Builder copy(Services service)
        {
            this.ServiceName = service.ServiceName;
            this.ServiceDescrip = service.ServiceDescrip;
            this.ServiceId = service.ServiceId;
            return this;

        }

        public Services build()
        {
            return new Services(this);
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
