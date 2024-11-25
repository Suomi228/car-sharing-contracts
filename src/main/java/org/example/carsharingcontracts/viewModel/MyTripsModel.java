package org.example.carsharingcontracts.viewModel;

import java.util.List;

public record MyTripsModel(
        BaseViewModel base,
        List<OneTripModel> myTrip
) {
}
