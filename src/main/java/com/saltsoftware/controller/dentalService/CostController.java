package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.factory.dentalService.CostFactory;
import com.saltsoftware.service.dentalService.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

/*
 * Junade Frizlar
 * 208046402
 * 26/09/2020
 * CostController: created for mapping the Cost, "CRUD" logic of the application
 */

@RestController
@RequestMapping("/cost")
public class CostController {

    @Autowired //used to create a connection to the Costservice package

    private CostService costService;

    //@RequestMapping("/createcost")

    @PostMapping("/create")
    public Cost create(@RequestBody Cost cost){
        Cost newCost = CostFactory.buildCost();
        return costService.create(newCost);
    }

    //read CostID

    @GetMapping("/read/{CostID}")
    @ResponseBody
    public Cost read(@PathVariable String id){
        return costService.read(id);
    }

    //getAll

    @GetMapping("/getAll")
    public Set<Cost> getAll(){
        return costService.getAll();
    }

    //update the cost

    @PostMapping("/update")
    public Cost update(@RequestBody Cost cost){
        return costService.update(cost);
    }


    //delete the CostID

    @DeleteMapping ("/delete/{CostID}")
    @ResponseBody
    public void delete(@PathVariable String CostID) {costService.delete(CostID);}

}
