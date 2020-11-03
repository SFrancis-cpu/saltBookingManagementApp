package com.saltsoftware.entity.dentalService;
/* @Author: Junade Frizlar
 *   StudentNumber : 208046402
 *   This is a cost entity class.
 * */

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class Cost {

    @Id
    private MysqlxDatatypes.Scalar.String costID;
    private double amount;

    Protected Cost(){}

    public String getCostID() {
        return costID;
    }

    public double getAmount() {
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
        public double amount;

        public Builder setCostID(String costID) {
            this.costID = costID;
            return this;
        }

        public Builder setAmount(double amount) {
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Cost cost = (Cost) object;
        return costID.equals(cost.costID);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), costID);
    }
}
