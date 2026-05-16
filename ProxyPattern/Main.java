package ProxyPattern;

import ProxyPattern.CopyProblem.Email;

public class Main {
    public static void main(String[] args) {
    



        Email e1 = new Email("hello@world.com", "","Testemail", "This is a test email");
        Email e2 = new Email(e1); // this is calling the copy constructor.

        e2.displayEmail();
    }
}
    