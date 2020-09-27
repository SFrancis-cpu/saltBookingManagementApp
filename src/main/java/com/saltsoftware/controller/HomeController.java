package com.saltsoftware.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sakeena Francis
 * Part Time
 * 215006097
 * 22-Sep-2020
 * Controller: HomeController created for mapping to home path of the application
 */

@RestController
public class HomeController {

    //Url (localhost:8080/home)
    @RequestMapping({"/", "/home"})
    String home()
    {
        return "Salt Booking Management Application Demo!!!!! ";
    }
}
