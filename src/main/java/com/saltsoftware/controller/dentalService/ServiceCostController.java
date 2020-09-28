package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
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
    @Autowired //used to create a connection to the service package
    private ServiceCost serviceCost;

    //@RequestMapping("/create")
    @PostMapping("/create")
    public ServiceCost create(@RequestBody ServiceCost serviceCost){
        ServiceCost newServiceCost = ServiceCostFactory.buildServiceCost(serviceCost.getServiceId(), serviceCost.getCostId());
        return null;

    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public ServiceCost read(@PathVariable String id){
        return null;
    }

    //getall
    @GetMapping("/all")
    public Set<ServiceCost> getall(){
        return null;
    }

    //update
    @PostMapping("/update")
    public ServiceCost update(@RequestBody ServiceCost serviceCost){
        return null;
    }

    //delete
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        // delete
    }

}
