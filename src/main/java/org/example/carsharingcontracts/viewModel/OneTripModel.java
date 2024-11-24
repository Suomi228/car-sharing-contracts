package org.example.carsharingcontracts.viewModel;

public record OneTripModel (
        String startDate,
        String endDate,
        String carName,
        double totalPrice
){
}
