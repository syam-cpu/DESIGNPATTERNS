package ATMMachine_StateDesignPattern.apis;

import ATMMachine_StateDesignPattern.apis.DTO.CreateTransactionDTO;

public class NodeBackendAPI implements BackendApi{
    // should be only responsible for connecting to backend and returning the repsonose got from backend

    public int createTransaction(CreateTransactionDTO createTransactionDTO)
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
}
