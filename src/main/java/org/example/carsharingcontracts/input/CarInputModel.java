package org.example.carsharingcontracts.input;

import jakarta.validation.constraints.NotBlank;

public class CarInputModel {
    @NotBlank(message = "Введите имя")
    private String name;
    @NotBlank(message = "Выберите класс")
    private String carClass;
    @NotBlank(message = "Введите почасовую оплату")
    private double hourPrice;
    @NotBlank(message = "Введите статус")
    private String status;
    @NotBlank(message = "Введите адрес")
    private String adress;

    public @NotBlank(message = "Введите имя") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Введите имя") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Выберите класс") String getCarClass() {
        return carClass;
    }

    public void setCarClass(@NotBlank(message = "Выберите класс") String carClass) {
        this.carClass = carClass;
    }

    @NotBlank(message = "Введите почасовую оплату")
    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(@NotBlank(message = "Введите почасовую оплату") double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public @NotBlank(message = "Введите статус") String getStatus() {
        return status;
    }

    public void setStatus(@NotBlank(message = "Введите статус") String status) {
        this.status = status;
    }

    public @NotBlank(message = "Введите адрес") String getAdress() {
        return adress;
    }

    public void setAdress(@NotBlank(message = "Введите адрес") String adress) {
        this.adress = adress;
    }
}
