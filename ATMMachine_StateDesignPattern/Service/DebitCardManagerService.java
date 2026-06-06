package ATMMachine_StateDesignPattern.Service;

import ATMMachine_StateDesignPattern.Models.Card;

public class DebitCardManagerService implements CardManagerService {

    @Override
    public boolean validateCard(Card card, String pin) {
        // ideally we should make these also connect to API
        // TODO Auto-generated method stub
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
