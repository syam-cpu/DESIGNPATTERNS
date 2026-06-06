package ATMMachine_StateDesignPattern.apis.DTO;

public class GetATMAmountRequestDTO {
    private final String atmId;

    public GetATMAmountRequestDTO(String atmId)
    {
        this.atmId = atmId;
    }
}
