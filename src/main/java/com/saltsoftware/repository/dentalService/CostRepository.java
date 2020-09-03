package com.saltsoftware.repository.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.Repository;

import java.util.Set;

public interface CostRepository extends Repository<Cost, String>
{
    Set<Cost> getAll();
}
