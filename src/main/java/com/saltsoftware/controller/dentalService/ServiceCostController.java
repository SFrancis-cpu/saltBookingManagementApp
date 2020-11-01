package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
import com.saltsoftware.service.dentalService.ServiceCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *
 * @author Lebusa.Letsoha
 * Student#: 216059186
 * Class desc: CostController: created for mapping the ServiceCostService, "CRUD" logic of the application to the user and enables the application to be accessable via the web
 * Date: 27 Sep 2020
 */

import java.util.Set;

@RestController
@RequestMapping("/serviceCost")
public class ServiceCostController {
    @Autowired //This handles everyt related serviceCost operations

    private ServiceCostService serviceCostService;

    //@RequestMapping("/create")
    @PostMapping("/create")
    public ServiceCost create(@RequestBody ServiceCost serviceCost){
        ServiceCost newServiceCost = ServiceCostFactory.buildServiceCost(serviceCost.getServiceId(), serviceCost.getServiceId());
        return serviceCostService.create(serviceCost);
    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public ServiceCost read(@PathVariable String id){
        return serviceCostService.read(id);
    }

    //getall
    @GetMapping("/all")
    public Set<ServiceCost> getall(){
        return serviceCostService.getAll();
    }

    //update
    @PostMapping("/update")
    public ServiceCost update(@RequestBody ServiceCost serviceCost){
        return serviceCostService.update(serviceCost);
    }

    //delete
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        serviceCostService.delete(id);
    }

}
