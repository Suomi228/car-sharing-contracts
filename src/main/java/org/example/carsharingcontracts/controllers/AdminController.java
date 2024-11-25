package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public interface AdminController {
    @GetMapping("/get")
    String getAllCars();
    @GetMapping("/get")
    String getCarsByStatus(@RequestParam String carStatus);
    @GetMapping("/carClass")
    String getCarsByClass(@RequestParam String carClass);
}
