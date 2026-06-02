package ATMMachine_StateDesignPattern.apis.DTO;

public class CreateTransactionRequestDTO {
    private final  String atmId;

    public CreateTransactionRequestDTO(String atmId)
    {
        this.atmId = atmId;
    }

    public String getAtmId()
    {
        return atmId;
    }
}
