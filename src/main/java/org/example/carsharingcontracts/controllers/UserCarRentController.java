package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.viewModel.ReturnCarModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rent")
public interface UserCarRentController {
    @GetMapping("/")
    String getCarList();
    @PutMapping("/")
    String rentCar(@RequestParam Long userId,  @RequestParam Long carId);
}
