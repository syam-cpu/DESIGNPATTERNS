package ProxyPattern.CopyProblem;

public class PremiumEmailClass extends Email {

    private String cc; 
    private String bcc;

    
    public PremiumEmailClass(String sender, String receiver, String subject, String body, String cc, String bcc)
    {
        super(sender, receiver, subject, body);

        this.cc = cc;
        this.bcc = bcc;
    }

    // copy constructor.

    PremiumEmailClass(PremiumEmailClass email)
    {
        super(email);
        this.cc = email.cc;
        this.bcc = email.bcc;
    }
    
    @Override
    public PremiumEmailClass Copy() {
        return new PremiumEmailClass(this);
    }
}
