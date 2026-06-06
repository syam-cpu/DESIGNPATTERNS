package ATMMachine_StateDesignPattern.Service;

import ATMMachine_StateDesignPattern.Models.Card;

public class CreditCardManagerService implements CardManagerService{

    @Override
    public boolean validateCard(Card card, String pin) {
        // TODO Auto-generated method stub
        // ideally we should make these also to connect to API
        throw new UnsupportedOperationException("Unimplemented method 'validateCard'");
    }

    @Override
    public boolean validateWithdrawal(int transactionId, double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateWithdrawal'");
    }

    @Override
    public boolean doTransaction(Card card, double amount, int transactionId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doTransaction'");
    }
    
}
