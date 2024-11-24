package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/trips")
public interface MyTripsController {
    @GetMapping("/{id}")
    String getMyTrips(@PathVariable Long id);
}