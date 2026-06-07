package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Factory.CardManagerFactory;
import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.Models.Card;
import ATMMachine_StateDesignPattern.Service.CardManagerService;
import ATMMachine_StateDesignPattern.Service.CashDispenserService;
import ATMMachine_StateDesignPattern.Service.CashDispenserServiceImpl;

public class DispensingCashState implements State{
    private final ATM atm;
    private final CashDispenserService cashDispenserService;

    public DispensingCashState(ATM atm)
    {
        this.atm = atm;
        this.cashDispenserService = new CashDispenserServiceImpl();
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
    public int dispenseCash(Card card, int amount, int transactionId) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isTxnSuccess = manager.doTransaction(card, amount, transactionId);
        if (isTxnSuccess)
        {
            this.cashDispenserService.dispenseCash(atm, amount);
        }
        else
        {
            System.out.println("Something went wrong");
        }
        this.atm.changeState(new EjectingCardState(atm));
        return amount;
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
