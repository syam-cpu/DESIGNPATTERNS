
public class DinersCreditCard extends CreditCard {

    @Override
    public void swipeAndPay()
    {
        System.out.println("Diners Credit Card swipeAndPay");
    }
    
    @Override
    public void onlinePayment()
    {
        System.out.println("Diners Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Diners Credit Card tapAndPay");
    }
}
