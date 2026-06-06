package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.Models.Card;

public class DispensingCashState implements State{
    private final ATM atm;

    public DispensingCashState(ATM atm)
    {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while dispensing cash");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin while dispensing cash");
    }

    @Override
    public int dispenseCash(int transactionId) {
        
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card while dispensing cash");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details while dispensing cash");
    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSING_CASH;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("cannot cancel transaction while dispensing cash");
    }
    
}
