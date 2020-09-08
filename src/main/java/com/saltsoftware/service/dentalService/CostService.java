package com.saltsoftware.service.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.service.IService;

import java.util.Set;

/*      Author: Junade Frizlar
        Student: 208046402
*/

public interface CostService extends IService <Cost, String >{
    Set<Cost> getAll();
}