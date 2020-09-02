package com.saltsoftware.repository.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.repository.Repository;
import com.saltsoftware.repository.payment.impl.PatientPaymentRecordImpl;

import java.util.Set;

public interface CostRepository extends Repository<Cost, String>
{
    Set<Cost> getAll();
}
