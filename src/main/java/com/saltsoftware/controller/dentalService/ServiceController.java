package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.factory.dentalService.ServiceFactory;
import com.saltsoftware.service.dentalService.impl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
/*
* Author: Abram Rakgotho
* Student Number:215031393
* Role: Responsible for creating serviceController to enable CRUD

 */

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceServiceImpl serviceService;

    @PostMapping("/create") //this annotation maps to create
    public Service create(@RequestBody Service service)
    {

       Service nService = ServiceFactory.createService(service.getServiceName(),service.getServiceDescrip());
        return serviceService.create(nService);

    }
    @GetMapping("/read/{id}")
    @ResponseBody
    public Service read(@PathVariable String id)
    {
        return serviceService.read(id);
    }
    @GetMapping("/all")
    @ResponseBody
    public Set<Service> getAll()
    {
        return serviceService.getAll();
    }
    @PostMapping("/update")
    public Service update(@RequestBody Service service)
    {
        return serviceService.update(service);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        serviceService.delete(id);
    }
}
