package com.saltsoftware.entity;

// created by Heinrich Arends

public class PatientPaymentType {
    private final String paymentTypeID;
    private final String paymentDescrip;

    //constructor
    private PatientPaymentType(UserBuilder builder) {
        this.paymentTypeID = builder.paymentTypeID;
        this.paymentDescrip = builder.paymentDescrip;
    }

    //inner builder class
    public static class UserBuilder{
        private final String paymentTypeID;
        private String paymentDescrip;

        //inner class constructor
        public UserBuilder(String paymentTypeID) {
            this.paymentTypeID = paymentTypeID;
        }

        //getters
        public UserBuilder paymentDescrip(String paymentDescrip){
            this.paymentDescrip = paymentDescrip;
            return this;
        }

        //builder method
        public PatientPaymentType build(){
            return new PatientPaymentType(this);
        }
    } //end of inner class

    //toString
    @Override
    public String toString() {
        return "PatientPaymentType{" +
                "paymentTypeID='" + paymentTypeID + '\'' +
                ", paymentDescrip='" + paymentDescrip + '\'' +
                ", records=" +
                '}';
    }
}
