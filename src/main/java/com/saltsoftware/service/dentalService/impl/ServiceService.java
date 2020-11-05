package com.saltsoftware.service.dentalService.impl;

import com.saltsoftware.entity.dentalService.Service;
import com.saltsoftware.service.IService;

import java.util.Set;

public interface ServiceService extends IService<Service, String > {
    Set<Service>getAll();
}
