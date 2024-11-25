package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/car")
public interface CrudCarController {
    @PostMapping("/create")
    void createCar(@RequestBody CarInputModel carInputModel);
    @PutMapping("/edit")
    void editCar(@RequestBody CarInputModel carInputModel);
    @DeleteMapping("/delete")
    void deleteCar(@RequestParam Long carId);
}
