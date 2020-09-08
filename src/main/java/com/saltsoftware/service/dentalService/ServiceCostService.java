package com.saltsoftware.service.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.service.IService;

import java.util.Set;

public interface ServiceCostService extends IService<ServiceCost, String> {
    Set<ServiceCost> getAll();
}
