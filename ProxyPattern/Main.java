package ProxyPattern;

import ProxyPattern.CopyProblem.Email;
import ProxyPattern.CopyProblem.PremiumEmailClass;

public class Main {
    public static void main(String[] args) {
    



        Email e1 = new Email("hello@world.com", "","Testemail", "This is a test email");
        //Email e2 = new Email(e1); // this is calling the copy constructor.

        Email e2 = e1.Copy();
        e2.displayEmail();

        PremiumEmailClass pe1 = new PremiumEmailClass("hellopremium@world.com", "", "Test premium mail", "This is a test mail", "a", "b");
        PremiumEmailClass pe2 = pe1.Copy();
    }
}
    