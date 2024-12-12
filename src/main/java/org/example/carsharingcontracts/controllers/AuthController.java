package org.example.carsharingcontracts.controllers;

import jakarta.validation.Valid;
import org.example.carsharingcontracts.input.LoginInputModel;
import org.example.carsharingcontracts.input.SignupInputModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/auth")
public interface AuthController {
    @GetMapping("/login")
    String login();
    @PostMapping("/login-error")
    String onFailedLogin(@ModelAttribute("number") String number, RedirectAttributes redirectAttributes);
    @PostMapping("/register")
    String register(@ModelAttribute @Valid SignupInputModel signupInputModel, BindingResult bindingResult);
    @GetMapping("/register")
    String showRegisterForm(Model model);
}