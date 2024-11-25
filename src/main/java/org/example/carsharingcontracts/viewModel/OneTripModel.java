package org.example.carsharingcontracts.viewModel;

public record OneTripModel (
        int rentId,
        String startDate,
        String endDate,
        String carName,
        double totalPrice
){
}
