package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.viewModel.ReturnCarModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public interface UserController {
    @GetMapping("/homePage")
    String homePage(@RequestParam(value = "carClass", required = false) String carClass, Model model);
    @PostMapping("/rentCar")
    String rentCar(Principal principal, @RequestParam Long carId, RedirectAttributes redirectAttributes);
    @GetMapping("/{id}")
    String getMyTrips(@PathVariable Long id, Model model);
    @GetMapping("/returnCarList")
    String returnCarPage(@PathVariable Long userId, Model model);
}
