package com.saltsoftware.service.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.service.IService;
import org.springframework.stereotype.Repository;

import java.util.Set;
// test comment

/*
        Author: Lebusa Letsoha
        Description: This class extends the interface IService which has the most common methods
        Date: 07-Sep-2020
 */
@Repository
public interface ServiceCostService extends IService<ServiceCost, String> {
    Set<ServiceCost> getAll();
}
