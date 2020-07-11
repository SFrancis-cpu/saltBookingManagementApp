package com.saltsoftware.util;

import java.util.UUID;
/*
 Author: Sakeena Francis
 Description: Create utility package that generates ID's
 Date: 11-Jul-2020
*/

import java.util.UUID;

public class GenericHelper {

    public static String generateID(){
        return UUID.randomUUID().toString();
    }
}
