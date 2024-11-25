package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.viewModel.ReturnCarModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public interface UserController {
    @GetMapping("/carList")
    String getCarList();
    @PostMapping("/")
    void rentCar(@RequestParam Long userId,  @RequestParam Long carId);
    @GetMapping("/{id}")
    String getMyTrips(@PathVariable Long id);
    @PostMapping("/return")
    void returnCar(@RequestBody ReturnCarModel returnCarModel);
}
