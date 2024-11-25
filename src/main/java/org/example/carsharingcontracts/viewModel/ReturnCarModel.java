package org.example.carsharingcontracts.viewModel;

import org.example.carsharingcontracts.input.AdressInputModel;

public record ReturnCarModel(
        BaseViewModel base,
        int rentId,
        String startDate,
        String carName,
        AdressInputModel adressInputModel
) {
}
