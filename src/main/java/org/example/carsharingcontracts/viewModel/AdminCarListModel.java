package org.example.carsharingcontracts.viewModel;

import java.util.List;

public record AdminCarListModel (
        BaseViewModel base,
        List<CarModel> carModels,
        String status
){
}
