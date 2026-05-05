public class Main {
    
    public static void main(String[] args) {
        CreditCard cc1 = new MasterCardCreditCard(new BankAccountRefundStrategy());
        CreditCard cc2  = new VisaCreditCard(new SameInstrumentRefundStrategy());
    }
}
