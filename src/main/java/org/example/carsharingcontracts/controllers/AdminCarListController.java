package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public interface AdminCarListController {
    @GetMapping("/get")
    String getCarList();
    @DeleteMapping("/delete/{id}")
    void deleteCar(@RequestParam Long id);
    @PutMapping("/edit")
    void editCar(@RequestBody CarInputModel carInputModel);
}
