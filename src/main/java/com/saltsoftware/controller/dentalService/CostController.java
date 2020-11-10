package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.entity.dentalService.ServiceCost;
import com.saltsoftware.factory.dentalService.CostFactory;
import com.saltsoftware.factory.dentalService.ServiceCostFactory;
import com.saltsoftware.service.dentalService.CostService;
import com.saltsoftware.service.dentalService.ServiceCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

/*
 *
 * @author Junade Frizlar
 * Student#: 208046402
 * Class desc: CostController
 *
 */

@RestController
@RequestMapping("/serviceCost")
public class CostController {
    @Autowired //This handles every related Cost operations

    private CostService costService;

    //@RequestMapping("/create")
    @PostMapping("/create")
    public Cost create(@RequestBody Cost cost){
        boolean costIdExist = false;


        System.out.println(cost.getCostID());


        ServiceCost newServiceCost = ServiceCostFactory.buildServiceCost(serviceCost.getServiceId(), serviceCost.getServiceId());
        Cost newCost = CostFactory.builCost(cost.getCostID());
        return costService.create(cost);
    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public Cost read(@PathVariable String id){
        return costService.read(id);
    }

    //getall
    @GetMapping("/all")
    public Set<Cost> getall(){
        return costService.getAll();
    }

    //update
    @PostMapping("/update")
    public Cost update(@RequestBody Cost cost){
        return costService.update(cost);
    }

    //delete
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        costService.delete(id);
    }

}
