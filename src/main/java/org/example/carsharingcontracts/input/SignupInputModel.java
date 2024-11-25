package org.example.carsharingcontracts.input;

import jakarta.validation.constraints.NotBlank;

public class SignupInputModel {
    @NotBlank(message = "Введите имя")
    String firstName;

    @NotBlank(message = "Введите фамилию")
    String lastName;

    @NotBlank(message = "Введите номер телефона")
    String number;

    @NotBlank(message = "Введите пароль")
    String password;
}
