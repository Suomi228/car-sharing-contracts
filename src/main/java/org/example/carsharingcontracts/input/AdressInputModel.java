package org.example.carsharingcontracts.input;

import jakarta.validation.constraints.NotBlank;

public class AdressInputModel {
    @NotBlank(message = "Введите адрес")
    private String adress;

    public @NotBlank(message = "Введите адрес") String getAdress() {
        return adress;
    }

    public void setAdress(@NotBlank(message = "Введите адрес") String adress) {
        this.adress = adress;
    }
}
