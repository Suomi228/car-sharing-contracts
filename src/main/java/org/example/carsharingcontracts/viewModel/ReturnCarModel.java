package org.example.carsharingcontracts.viewModel;

import org.example.carsharingcontracts.input.AdressInputModel;

public record ReturnCarModel(
        String startDate,
        String endDate,
        String carName,
        AdressInputModel adressInputModel,
        double totalPrice
) {
}
