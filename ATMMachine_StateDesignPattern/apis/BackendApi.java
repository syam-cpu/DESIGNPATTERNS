package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.apis.DTO.CreateTransactionRequestDTO;
import ATMMachine_StateDesignPattern.apis.DTO.UpdateATMStateRequestDTO;

public interface BackendApi {
    int createTransaction(CreateTransactionRequestDTO createTransactionDTO);

    boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO);
}
