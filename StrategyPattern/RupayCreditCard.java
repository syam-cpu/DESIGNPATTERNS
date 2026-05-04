
public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard , RefundCompatibleCreditCard {

    private RefundStrategy refundStrategy;

    public RupayCreditCard()
    {
        refundStrategy = new SameInstrumentRefundStrategy();
    }

    @Override
    public void swipeAndPay()
    {
        System.out.println("Rupay Credit Card swipeAndPay");
    }

    @Override
    public void onlinePayment()
    {
        System.out.println("Rupay Credit Card onlinePayment");
    }

    @Override
    public void tapAndPay()
    {
        System.out.println("Rupay Credit Card tapAndPay");
    }

    @Override
    public void upiPayment()
    {
        System.out.println("Rupay Credit Card upiPayment");
    }

    @Override
    public void doRefund()
    {
        System.out.println("Rupay Credit Card doRefund");
        refundStrategy.doRefund();
    }
}
