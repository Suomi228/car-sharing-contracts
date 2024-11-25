package org.example.carsharingcontracts.controllers;

import ch.qos.logback.core.model.Model;
import org.example.carsharingcontracts.input.LoginInputModel;
import org.example.carsharingcontracts.input.SignupInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public interface AuthController {
    @PostMapping("/login")
    void login(@ModelAttribute("input") LoginInputModel input, Model model);
    @PostMapping("/signup")
    void signup(@ModelAttribute("input") SignupInputModel input, Model model);
}