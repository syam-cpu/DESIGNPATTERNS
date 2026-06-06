package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Factory.CardManagerFactory;
import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.Models.Card;
import ATMMachine_StateDesignPattern.Service.CardManagerService;

public class ReadCardDetailsAndPinState implements State {

    private final ATM atm;

    public ReadCardDetailsAndPinState(ATM atm)
    {
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while reading card details and pin");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, String pin) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isCardValid = manager.validateCard(card, pin);
        if (isCardValid)
        {
            this.atm.changeState(new ReadingCashWithdrawalDetailsState(atm));
        }
        else
        {
            this.atm.changeState(new ReadyForTransactionState(atm));
        }
        return isCardValid;
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
    public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
        throw new IllegalStateException("Cannot read cash withdraw details while reading card details and pin");
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CARD_DETAILS_AND_PIN;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        try{
            this.atm.changeState(new ReadyForTransactionState(atm));
            return true;
        }
        catch(Exception ex)
        {
            throw new IllegalStateException("Cannot cancel transaction while reading card details and pin");
        }
    }
}
