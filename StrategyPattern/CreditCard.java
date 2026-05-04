

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expirayDate;
    private int cvv;

    //getters and setters
    protected void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    protected void setCardHolder(String cardHolder)
    {
        this.cardHolder = cardHolder;
    }

    protected void setExpiryDate(String expiryDate)
    {
        this.expirayDate = expiryDate;
    }

    protected void setCvv(int cvv)
    {
        this.cvv = cvv;
    }

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
}