package org.example.carsharingcontracts.controllers;
import org.springframework.ui.Model;
import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public interface AdminController {
    @GetMapping("/get")
    String getAllCars(@RequestParam(value = "carClass", required = false) String carClass, @RequestParam(value = "carStatus", required = false) String carStatus, Model model);
    @GetMapping("/editCar/{id}")
    String editCar(@PathVariable("id") Long id, Model model);
    @PostMapping("/updateCar")
    String updateCar(@ModelAttribute CarInputModel carInputModel);
    @PostMapping("/deleteCar/{id}")
    String deleteCar(@PathVariable("id") Long id);
}
