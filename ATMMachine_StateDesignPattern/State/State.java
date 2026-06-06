package ATMMachine_StateDesignPattern.State;

import ATMMachine_StateDesignPattern.Enums.ATMState;
import ATMMachine_StateDesignPattern.Models.Card;

public interface State {
    
    int initTransaction();

    boolean readCardDetailsAndPin(Card card, String pin); // returns true if card is valid. and false otherwise

    int dispenseCash(int transactionId); // returns the amount dispensed.

    void ejectCard();

    boolean readCashWithdrawalDetails(Card card, int transactionId , int amount); // returns true if cashwithdrawal details are valid and false otherwise.
    
    ATMState getState();

    boolean cancelTransaction(int transactionId);
}
