package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.Card;

public class ReadyForTransaction implements State {

    @Override
    public int initTransaction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initTransaction'");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readCardDetailsAndPin'");
    }

    @Override
    public int dispenseCash(int transactionId) {
        // TODO Auto-generated method stub
        throw new IllegalStateException();
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
