package ProxyPattern.CopyProblem;

public class Email {
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Email(String sender, String receiver, String subject, String body)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }
    

    public Email(Email email)
    {
        this.sender = email.sender;
        this.receiver = email.receiver;
        this.subject = email.subject;
        this.body = email.body;
    }


    public void sendEmail()
    {
        System.out.println("Email sent to " + receiver);
    }

    public String getSender()
    {
        return sender;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public String getReceiver()
    {
        return receiver;
    }

    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public void displayEmail()
    {
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
