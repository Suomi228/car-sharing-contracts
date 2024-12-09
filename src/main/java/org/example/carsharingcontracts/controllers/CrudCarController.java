package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/car")
public interface CrudCarController {
    @PostMapping("/create")
    String createCar(@ModelAttribute CarInputModel carInputModel);
    @GetMapping("/create")
    String showCreateCarForm(Model model);
    @PutMapping("/edit")
    void editCar(@RequestBody CarInputModel carInputModel);
    @DeleteMapping("/delete")
    void deleteCar(@RequestParam Long carId);
}
