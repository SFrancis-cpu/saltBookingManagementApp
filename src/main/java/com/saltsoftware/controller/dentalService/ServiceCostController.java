package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.entity.employee.EmployeeRole;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
import com.saltsoftware.factory.employee.EmployeeRoleFactory;
import com.saltsoftware.service.dentalService.ServiceCostService;
import com.saltsoftware.service.dentalService.impl.ServiceCostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *
 * @author Lebusa.Letsoha
 * Student#: 216059186
 * Class desc: CostController: created for mapping the Cost, "CRUD" logic of the application
 * Date: 27 Sep 2020
 */

import java.util.Set;

@RestController
@RequestMapping("/serviceCost")
public class ServiceCostController {
    @Autowired //This handles everyt related serviceCost operations
    //private ServiceCostServiceImpl service;
    private ServiceCostService costService;

    //@RequestMapping("/create")
    @PostMapping("/create")
    public ServiceCost create(@RequestBody ServiceCost serviceCost){
        ServiceCost newServiceCost = ServiceCostFactory.buildServiceCost(serviceCost.getServiceId(), serviceCost.getServiceId());
        return costService.create(serviceCost);
    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public ServiceCost read(@PathVariable String id){
        return costService.read(id);
    }

    //getall
    @GetMapping("/all")
    public Set<ServiceCost> getall(){
        return costService.getAll();
    }

    //update
    @PostMapping("/update")
    public ServiceCost update(@RequestBody ServiceCost serviceCost){
        return costService.update(serviceCost);
    }

    //delete
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        costService.delete(id);
    }

}
