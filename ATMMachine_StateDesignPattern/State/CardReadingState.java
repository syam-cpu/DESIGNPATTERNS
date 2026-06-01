package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.Card;

public class CardReadingState implements State {

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
        throw new UnsupportedOperationException("Unimplemented method 'dispenseCash'");
    }

    @Override
    public void ejectCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }

    @Override
    public boolean readCashWithdrawalDetails(int transactionId, int amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readCashWithdrawalDetails'");
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CARD_DETAILS_AND_PIN;
    }
    
}
