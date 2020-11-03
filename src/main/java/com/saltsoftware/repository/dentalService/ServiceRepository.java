package com.saltsoftware.repository.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends JpaRepository<Service, String>
{

}
