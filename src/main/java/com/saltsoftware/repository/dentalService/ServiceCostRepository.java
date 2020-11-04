package com.saltsoftware.repository.dentalService;

import com.saltsoftware.entity.dentalService.ServiceCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/*
        Author: Lebusa Letsoha
        Description: This interface extends the interface that has the most common methods and allows for the internal methods specific to the Service Cost object creation
        Date: 31-Aug-2020
 */
@Repository
public interface ServiceCostRepository extends JpaRepository<ServiceCost, String> {
}
