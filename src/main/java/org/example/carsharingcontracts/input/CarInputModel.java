package org.example.carsharingcontracts.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CarInputModel {
    @NotBlank(message = "Введите имя")
    private String name;
    @NotNull(message = "Введите год")
    @Positive(message = "Год должен быть положительным числом")
    private int year;
    @NotBlank(message = "Введите номер машины")
    private String number;
    @NotBlank(message = "Выберите класс")
    private String carClass;
    @NotNull(message = "Введите почасовую оплату")
    @Positive(message = "Цена должна быть положительным числом")
    private double hourPrice;
    @NotBlank(message = "Введите статус")
    private String status;
    @NotBlank(message = "Введите адрес")
    private String adress;


    public CarInputModel() {
    }

    public CarInputModel(String name, int year, String number, String carClass, double hourPrice, String status, String adress) {
        this.name = name;
        this.year = year;
        this.number = number;
        this.carClass = carClass;
        this.hourPrice = hourPrice;
        this.status = status;
        this.adress = adress;
    }

    public @NotBlank(message = "Введите имя") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Введите имя") String name) {
        this.name = name;
    }

    @NotBlank(message = "Введите год")
    public int getYear() {
        return year;
    }

    public void setYear(@NotBlank(message = "Введите год") int year) {
        this.year = year;
    }

    public @NotBlank(message = "Введите номер машины") String getNumber() {
        return number;
    }

    public void setNumber(@NotBlank(message = "Введите номер машины") String number) {
        this.number = number;
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
