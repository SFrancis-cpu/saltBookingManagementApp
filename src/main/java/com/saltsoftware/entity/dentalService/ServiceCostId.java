package com.saltsoftware.entity.dentalService;

import java.io.Serializable;
import java.util.Objects;

public class ServiceCostId implements Serializable {
    private String costId, serviceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceCostId that = (ServiceCostId) o;
        return costId.equals(that.costId) &&
                serviceId.equals(that.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costId, serviceId);
    }
}
