package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Factory.CardManagerFactory;
import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.Models.Card;
import ATMMachine_StateDesignPattern.Service.CardManagerService;

public class ReadingCashWithdrawalDetailsState implements State{

    private final ATM atm;

    public ReadingCashWithdrawalDetailsState(ATM atm)
    {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot Initialise a transaction while reading cash withdraw details");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin  again ");
    }

    @Override
    public int dispenseCash(int transactionId) {
        throw new IllegalStateException("Cannot dispense cash without reading cash withdrawal details.");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without reading card details and pin");
    }

    @Override
    public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isWithDrawalValid =  manager.validateWithdrawal(transactionId, amount);

        if (isWithDrawalValid)
        {
            this.atm.changeState(new DispensingCashState(atm));
        }
        else
        {
            this.atm.changeState(new ReadyForTransactionState(atm));
        }
        return isWithDrawalValid;
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CASHWISHDRAWAL_DETAILS;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(atm));
        return true;
    }
    
}
