package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.apis.DTO.CreateTransactionRequestDTO;
import ATMMachine_StateDesignPattern.apis.DTO.GetATMAmountRequestDTO;
import ATMMachine_StateDesignPattern.apis.DTO.UpdateATMStateRequestDTO;

public class NodeBackendAPI implements BackendApi{
    // should be only responsible for connecting to backend and returning the repsonose got from backend

    public int createTransaction(CreateTransactionRequestDTO createTransactionDTO)
    {
        //1 . validation

        if (createTransactionDTO.getAtmId() == null || createTransactionDTO.getAtmId().isEmpty())
        {
            throw new IllegalArgumentException("ATM ID cannot be null or empty");
        }

        //2. connect to the backend
        // to mimic the backend call lets returnn a new random transaction Id
        int txnId = (int)(Math.random()* 1000);

        //3 . Return the response.
        System.out.println("Creating a new transaction for this atm");
        return 1;
    }

    @Override
    public boolean updateState(UpdateATMStateRequestDTO updateATMStateDTO) {
        //Assume that there is an implementation that calls the backend to update the state of the ATM.

        throw new UnsupportedOperationException("Unimplemented method 'updateState'");
    }

    @Override
    public int getATMAmount(GetATMAmountRequestDTO getATMAmountRequestDTO) {

        return 1000;
    }
}
