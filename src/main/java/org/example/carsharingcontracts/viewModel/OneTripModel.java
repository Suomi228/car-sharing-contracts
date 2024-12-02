package org.example.carsharingcontracts.viewModel;

public record OneTripModel (
        long rentId,
        String startDate,
        String endDate,
        String carName,
        double totalPrice
){
}
