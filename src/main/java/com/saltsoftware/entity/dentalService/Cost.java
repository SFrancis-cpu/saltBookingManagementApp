package com.saltsoftware.entity.dentalService;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* @Author: Junade Frizlar
 *   StudentNumber : 208046402
 *   This is a cost entity class.
 * */
public class Cost implements Set<Cost> {
    public String costID;
    public String amount;

    public String getCostID() {
        return costID;
    }

    public String getAmount() {
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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Cost> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Cost cost) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Cost> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static class Builder{

        public String costID;
        public String amount;

        public Builder setCostID(String costID) {
            this.costID = costID;
            return this;
        }

        public Builder setAmount(String amount) {
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
