package com.saltsoftware.entity;
/* @Author: Junade Frizlar
 *   StudentNumber : 208046402
 *   This is a cost entity class.
 * */
public class Cost {
    public String costID;
    public Double amount;

    public String getCostID() {
        return costID;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "costID='" + costID + '\'' +
                ", amount=" + amount +
                '}';
    }

    private Cost(Builder builder) {
        this.costID = builder.costID;
        this.amount = builder.amount;


    }

    public static class Builder{

        public String costID;
        public Double amount;

        public Builder setCostID(String costID) {
            this.costID = costID;
            return this;
        }

        public Builder setAmount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Builder copy(Cost cost) {
            this.costID = cost.costID;
            this.amount = cost.amount;

            return this;
        }

        public Cost build() {
            return new Cost(this);
        }
    }
}
