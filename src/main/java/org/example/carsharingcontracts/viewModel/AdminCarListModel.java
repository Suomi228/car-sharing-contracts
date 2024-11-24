package org.example.carsharingcontracts.viewModel;

import java.util.List;

public record AdminCarListModel (
        List<CarModel> carModels,
        String status
){
}
