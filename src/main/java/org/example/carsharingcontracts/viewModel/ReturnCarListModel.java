package org.example.carsharingcontracts.viewModel;

import java.util.List;

public record ReturnCarListModel(
        BaseViewModel base,
        List<ReturnCarModel> returnCarModels
) {
}
