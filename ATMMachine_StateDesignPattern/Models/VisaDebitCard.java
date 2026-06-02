package ATMMachine_StateDesignPattern.Models;

import ATMMachine_StateDesignPattern.Enums.CardType;

public class VisaDebitCard extends Card implements Visa ,Debit{

    public VisaDebitCard(long cardNumber, int pin, String name, CardType cardType, String bankName) {
        super(cardNumber, pin, name, cardType, bankName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void makePinPayment() {
        this.connectToVisaCard();
        throw new UnsupportedOperationException("Unimplemented method 'makePinPayment'");
    }

    @Override
    public void connectToVisaCard() {
        System.out.println("Connecting to Visa");
    }
}
