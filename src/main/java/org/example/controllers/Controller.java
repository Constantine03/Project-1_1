package org.example.controllers;

import org.example.services.Service;

public class Controller {
    public static String getCountry(String countryName) {
        return Service.getCountry(countryName);
    }
}
