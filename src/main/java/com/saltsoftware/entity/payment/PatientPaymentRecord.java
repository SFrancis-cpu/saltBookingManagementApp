package com.saltsoftware.entity.payment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author name: Linton Appollis
 *student num: 216182484
 *Desc: Entity for PatientPaymentRecord
 *date: 3 July 2020
*/
@Entity

public class PatientPaymentRecord
{
// changing attributes to Private appose to UML
    protected PatientPaymentRecord(){}

    @Id
    private String payReceiptNumber;
    private String payDate;
    private String payAmount;

    private PatientPaymentRecord (Builder builder)
    {
        this.payReceiptNumber = builder.payReceiptNumber;
        this.payDate = builder.payDate;
        this.payAmount = builder.payAmount;
    }

    public String getPayReceiptNumber() {
        return payReceiptNumber;
    }

    public String getPayDate() {
        return payDate;
    }

    public String getPayAmount() {
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
        private String payReceiptNumber;
        private String payDate;
        private String payAmount;

        public Builder setpayReceiptNumber (String payReceiptNumber)
        {
            this.payReceiptNumber = payReceiptNumber;
            return this;
        }
        public Builder setpayDate (String payDate)
        {
            this.payDate = payDate;
            return this;
        }
        public Builder setpayAmount(String payAmount)
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

