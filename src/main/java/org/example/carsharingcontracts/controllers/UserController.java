package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.viewModel.ReturnCarModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public interface UserController {
    @GetMapping("/homePage")
    String homePage(@RequestParam(value = "carClass", required = false) String carClass, Model model);
    @GetMapping("/carClass")
    String getCarsByClass(@RequestParam String carClass);
    @PostMapping("/rent")
    void rentCar(@RequestParam Long userId,  @RequestParam Long carId);
    @GetMapping("/{id}")
    String getMyTrips(@PathVariable Long id, Model model);
    @PostMapping("/return")
    void returnCar(@RequestBody ReturnCarModel returnCarModel);
}
