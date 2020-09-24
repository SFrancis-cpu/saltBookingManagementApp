package com.saltsoftware.entity.payment;


import java.io.Serializable;

public class PatientPaymentType implements Serializable {

    //required parameters
    private String paymentTypeID, paymentDescrip;

    //default constructor
    private PatientPaymentType(){}

    //constructor
    private PatientPaymentType(Builder builder) {
        this.paymentTypeID = builder.paymentTypeID;
        this.paymentDescrip = builder.paymentDescrip;
    }

    //getters
    public String getPaymentTypeID() {
        return paymentTypeID;
    }

    public String getPaymentDescrip() {
        return paymentDescrip;
    }

    @Override
    public String toString() {
        return "PatientPaymentType{" +
                "paymentTypeID='" + paymentTypeID + '\'' +
                ", paymentDescrip='" + paymentDescrip + '\'' +
                '}';
    }

    //inner builder class
    public static class Builder{
        private String paymentTypeID, paymentDescrip;

        //setters
        public Builder setPaymentID(String paymentTypeID){
            this.paymentTypeID = paymentTypeID;
            return this;
        }

        public Builder setDescrip(String paymentDescrip){
            this.paymentDescrip = paymentDescrip;
            return this;
        }

        //copy method
        public Builder copy(PatientPaymentType patientPaymentType){
            this.paymentTypeID = patientPaymentType.paymentTypeID;
            this.paymentDescrip = patientPaymentType.paymentDescrip;
            return this;
        }

        //builder method
        public PatientPaymentType build(){

            return new PatientPaymentType(this);
        }
    }
    //end of inner class
}
