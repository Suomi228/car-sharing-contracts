package org.example.carsharingcontracts.controllers;
import org.springframework.ui.Model;
import org.example.carsharingcontracts.input.CarInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/admin")
public interface AdminController {
    @GetMapping("/get")
    String getAllCars(@RequestParam(value = "carClass", required = false) String carClass, @RequestParam(value = "carStatus", required = false) String carStatus, Model model, Principal principal);
    @GetMapping("/editCar/{id}")
    String editCar(@PathVariable("id") Long id, Model model, Principal principal);
    @PostMapping("/create")
    String createCar(@ModelAttribute CarInputModel carInputModel, Principal principal);
    @GetMapping("/create")
    String showCreateCarForm(Model model, Principal principal);
    @PostMapping("/updateCar")
    String updateCar(@ModelAttribute CarInputModel carInputModel, Principal principal);
    @PostMapping("/deleteCar/{id}")
    String deleteCar(@PathVariable("id") Long id, Principal principal);

}
