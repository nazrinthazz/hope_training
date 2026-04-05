package EmailSystem.Email;

import EmailSystem.Exception.*;

public class Email {
    private String sender;
    private String receiver;
    private String subject;
    private String body;

    public Email(String sender, String receiver, String subject, String body)throws InvalidEmailException, EmptyFieldException {
        
        if (sender == null || receiver == null || !sender.contains("@") || !receiver.contains("@")) {
            throw new InvalidEmailException("Invalid email format");
        }else if (subject == null || body == null || subject.isEmpty() || body.isEmpty()){
            throw new EmptyFieldException("Subject or body cannot be empty");
        }else{
            this.sender = sender;
            this.receiver = receiver;
            this.subject = subject;
            this.body = body;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void display() {
        System.out.println("----------------------");
        System.out.println("From: " + sender);
        System.out.println("To: " + receiver);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
