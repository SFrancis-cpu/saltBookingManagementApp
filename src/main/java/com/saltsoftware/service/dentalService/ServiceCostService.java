package com.saltsoftware.service.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.service.IService;

import java.util.Set;

/*
        Author: Lebusa Letsoha
        Description: This class extends the interface IService which has the most common methods
        Date: 07-Sep-2020
 */

public interface ServiceCostService extends IService<ServiceCost, String> {
    Set<ServiceCost> getAll();
}
