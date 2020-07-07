package com.saltsoftware.entity;

//Author name: Linton Appollis
//student num: 216182484

public class PatientPaymentRecord
{
// changing attributes to Private appose to UML

    private int payReceiptNumber;
    private String payDate;
    private double payAmount;

    private PatientPaymentRecord (Builder builder)
    {
        this.payReceiptNumber = builder.payReceiptNumber;
        this.payDate = builder.payDate;
        this.payAmount = builder.payAmount;
    }

    public int getPayReceiptNumber() {
        return payReceiptNumber;
    }

    public String getPayDate() {
        return payDate;
    }

    public double getPayAmount() {
        return payAmount;
    }

    @Override
    public String toString() {
        return "PatientPaymentRecord{" +
                "payReceiptNumber=" + payReceiptNumber +
                ", payDate='" + payDate + '\'' +
                ", payAmount=" + payAmount +
                '}';
    }

    public static class Builder
    {
        private int payReceiptNumber;
        private String payDate;
        private double payAmount;

        public Builder setpayReceiptNumber (int payReceiptNumber)
        {
            this.payReceiptNumber = payReceiptNumber;
            return this;
        }
        public Builder setpayDate (String payDate)
        {
            this.payDate = payDate;
            return this;
        }
        public Builder setpayAmount(double payAmount)
        {
            this.payAmount = payAmount;
            return this;
        }

        public Builder copy (PatientPaymentRecord patientPaymentRecord)
        {
            this.payReceiptNumber = patientPaymentRecord.payReceiptNumber;
            this.payDate = patientPaymentRecord.payDate;
            this.payAmount = patientPaymentRecord.payAmount;
            return this;
        }

        public PatientPaymentRecord build()
        {
            return new PatientPaymentRecord(this);
        }


    }

}

