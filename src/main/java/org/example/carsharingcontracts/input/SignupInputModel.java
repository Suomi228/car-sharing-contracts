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

    public SignupInputModel() {
    }

    public SignupInputModel(String firstName, String lastName, String number, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.password = password;
    }

    public @NotBlank(message = "Введите имя") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "Введите имя") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Введите фамилию") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Введите фамилию") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "Введите номер телефона") String getNumber() {
        return number;
    }

    public void setNumber(@NotBlank(message = "Введите номер телефона") String number) {
        this.number = number;
    }

    public @NotBlank(message = "Введите пароль") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Введите пароль") String password) {
        this.password = password;
    }
}
