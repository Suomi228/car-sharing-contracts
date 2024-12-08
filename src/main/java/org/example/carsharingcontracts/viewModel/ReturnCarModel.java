package org.example.carsharingcontracts.viewModel;

import org.example.carsharingcontracts.input.AdressInputModel;

public record ReturnCarModel(
        BaseViewModel base,
        long carId,
        long rentId,
        String startDate,
        String carName,
        AdressInputModel adressInputModel
) {
}
