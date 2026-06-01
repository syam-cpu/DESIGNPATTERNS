package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.apis.DTO.CreateTransactionDTO;

public interface BackendApi {
    int createTransaction(CreateTransactionDTO createTransactionDTO);
}
