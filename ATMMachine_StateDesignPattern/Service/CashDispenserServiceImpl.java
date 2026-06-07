package ATMMachine_StateDesignPattern.Service;

import ATMMachine_StateDesignPattern.Models.ATM;
import ATMMachine_StateDesignPattern.apis.BackendApi;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.apis.DTO.GetATMAmountRequestDTO;

public class CashDispenserServiceImpl implements CashDispenserService{

    private final BackendApi backendApi;

    public CashDispenserServiceImpl()
    {
        this.backendApi = new NodeBackendAPI();
    }

    @Override
    public void dispenseCash(ATM atm, int amount) {
        // call the server to dispense the cash
        int atmAmount = this.backendApi.getATMAmount(new GetATMAmountRequestDTO(atm.getAtmId()));

        if (atmAmount < amount)
        {
            throw new RuntimeException("ATM doesnt have enough money to dispense");
        }

        System.out.println("Dispensing cash" + amount);
    }
}
