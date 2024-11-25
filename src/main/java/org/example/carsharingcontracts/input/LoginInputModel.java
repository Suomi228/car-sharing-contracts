package org.example.carsharingcontracts.input;

import jakarta.validation.constraints.NotBlank;

public class LoginInputModel {
    @NotBlank(message = "Введите номер телефона")
    String number;

    @NotBlank(message = "Введите пароль")
    String password;
}
