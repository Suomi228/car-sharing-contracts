package org.example.carsharingcontracts.controllers;

import org.example.carsharingcontracts.input.CarInputModel;
import org.example.carsharingcontracts.viewModel.ReturnCarModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/returnCar")
public interface ReturnCarController {
    @DeleteMapping("/")
    void returnCar(@RequestBody ReturnCarModel returnCarModel);
}
