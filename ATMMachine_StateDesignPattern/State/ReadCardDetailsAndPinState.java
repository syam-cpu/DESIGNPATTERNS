package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.Card;

public class ReadCardDetailsAndPinState implements State {

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while reading card details and pin");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card) {
        return false;
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while reading card details and pin");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details while reading card details and pin");
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CARD_DETAILS_AND_PIN;
    }
    
}
