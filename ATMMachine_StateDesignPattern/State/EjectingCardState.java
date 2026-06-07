package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.Models.Card;

public class EjectingCardState implements State {

    private final ATM atm;

    public EjectingCardState(ATM atm)
    {
        this.atm = atm;
    }

	@Override
	public int initTransaction() {
		throw new IllegalStateException("Cannot init transaction while ejecting card");
	}

	@Override
	public boolean readCardDetailsAndPin(Card card, String pin) {
        throw new IllegalStateException("Cannot read card details and pin while ejecting card");
	}

	@Override
	public int dispenseCash(Card card, int amount, int transactionId) {
		throw new IllegalStateException("Cannot dispense cash while ejecting card");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected, please take it");
        this.atm.changeState(new ReadyForTransactionState(atm));    
	}

	@Override
	public boolean readCashWithdrawalDetails(Card card, int transactionId, int amount) {
		throw new IllegalStateException("Cannot read cash withdraw details while ejecting card");
	}

	@Override
	public ATMState getState() {
		return ATMState.EJECTING_CARD;
	}

	@Override
	public boolean cancelTransaction(int transactionId) {
		throw new IllegalStateException("Cannot cancel transaction while ejecting the card");
	}
}
