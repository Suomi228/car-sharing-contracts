package org.example.carsharingcontracts.viewModel;

public record CarModel (
        String carName,
        String photoUrl,
        double hourPrice,
        String carClass,
        String adress
){
}
