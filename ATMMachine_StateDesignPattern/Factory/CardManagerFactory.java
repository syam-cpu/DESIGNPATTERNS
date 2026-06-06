package ATMMachine_StateDesignPattern.Factory;

import ATMMachine_StateDesignPattern.Enums.CardType;
import ATMMachine_StateDesignPattern.Service.CardManagerService;
import ATMMachine_StateDesignPattern.Service.CreditCardManagerService;
import ATMMachine_StateDesignPattern.Service.DebitCardManagerService;

public class CardManagerFactory {
    
    public static CardManagerService getCardManager(CardType cardType)
    {
        CardManagerService cardManagerService = null;

        if (cardType.equals(CardType.DEBIT))
        {
            cardManagerService = new DebitCardManagerService();
        }
        else if(cardType.equals(CardType.CREDIT))
        {
            cardManagerService = new CreditCardManagerService();
        }
        else
        {
            throw new IllegalArgumentException("Invalid Card Type");
        }
        return cardManagerService;
    }
}
