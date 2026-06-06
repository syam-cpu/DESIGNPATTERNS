package ATMMachine_StateDesignPattern.Service;

import ATMMachine_StateDesignPattern.Models.ATM;

public interface CashDispenserService {
    void dispenseCash(ATM atm, int amount);
}
