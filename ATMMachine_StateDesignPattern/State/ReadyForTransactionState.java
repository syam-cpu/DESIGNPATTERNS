package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.Models.Card;
import ATMMachine_StateDesignPattern.apis.BackendApi;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.apis.DTO.CreateTransactionRequestDTO;

public class ReadyForTransactionState implements State {


    private final ATM atm;
    private final BackendApi backendApi;

    public ReadyForTransactionState(ATM atm, BackendApi backendApi)
    {
        this.atm = atm;
        this.backendApi = backendApi;
    }

    @Override
    public int initTransaction() {
        CreateTransactionRequestDTO createTransactionDTO = new CreateTransactionRequestDTO(this.atm.getAtmId());
        int transactionId = this.backendApi.createTransaction(createTransactionDTO);
        if (transactionId == 0)
        {
            throw new RuntimeException("Transaction could not be created");
        }
        // Now that we have the transaction Id from backend , we should move the ATM to next state 
        this.atm.changeState(new ReadCardDetailsAndPinState());
        return transactionId;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        throw new IllegalStateException("Cannot read card details and pin without inserting card");
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without reading card details");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount) {
        throw new IllegalStateException("cannot read cash withdrawal details without reading card details.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}
