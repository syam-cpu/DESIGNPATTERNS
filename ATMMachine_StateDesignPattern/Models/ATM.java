package ATMMachine_StateDesignPattern.Models;

import ATMMachine_StateDesignPattern.State.ReadyForTransactionState;
import ATMMachine_StateDesignPattern.State.State;
import ATMMachine_StateDesignPattern.apis.BackendApi;
import ATMMachine_StateDesignPattern.apis.NodeBackendAPI;
import ATMMachine_StateDesignPattern.apis.DTO.UpdateATMStateRequestDTO;

public class ATM {
    private final String atmId;
    private State state;
    private final BackendApi backendAPI;

    public ATM(String atmId)
    {
       this.atmId = atmId;
       this.backendAPI = new NodeBackendAPI();
       this.state = new ReadyForTransactionState(this, this.backendAPI);
    }

    public String getAtmId()
    {
        return atmId;
    }

    public void  changeState(State newState)
    {
        this.state = newState;
        // now call the server to Persist the state on the server also.
        this.backendAPI.updateState(new UpdateATMStateRequestDTO(atmId, newState.getState()));
    }
}
