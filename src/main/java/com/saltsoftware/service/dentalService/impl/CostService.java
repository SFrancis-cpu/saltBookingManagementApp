package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.entity.employee.Employee;
import com.saltsoftware.service.IService;
/*      Author: Junade Frizlar
        Student 208046402
*/

import java.util.Set;

public interface CostService extends IService <Cost, String >{
    Set<Cost> getAll();
}
