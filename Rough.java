import java.util.*;
class InvalidEmailException extends Exception {
    public InvalidEmailException(String msg) {
        super(msg);
    }
}

class EmptyFieldException extends Exception {
    public EmptyFieldException(String msg) {
        super(msg);
    }
}

class AttachmentNotFoundException extends Exception {
    public AttachmentNotFoundException(String msg) {
        super(msg);
    }
}

class EmailNotSentException extends Exception {
    public EmailNotSentException(String msg) {
        super(msg);
    }
}

class User {
    private String emailId;
    private String name;
    private MailBox mailbox;

    public User(String emailId, String name) {
        this.emailId = emailId;
        this.name = name;
        mailbox = new MailBox();
    }


    public String getEmailId() {
        return emailId;
    }

    public MailBox getMailbox() {
        return mailbox;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + emailId + ")";
    }

    public void sendEmail(User receiver, Email email)throws EmailNotSentException {
        if (receiver == null || email == null) {
            throw new EmailNotSentException("Receiver or email is not found");
        }else{
        mailbox.addToSent(email);
        receiver.receiveEmail(email);
        }
    }

    public void receiveEmail(Email email) {
        mailbox.addToInbox(email);
    }
}

class Email {
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

class AttachmentEmail extends Email {
    private String fileName;

    public AttachmentEmail(String sender, String receiver, String subject, String body, String fileName)throws InvalidEmailException, EmptyFieldException, AttachmentNotFoundException {
        super(sender, receiver, subject, body);
        if (fileName == null || fileName.isEmpty()) {
            throw new AttachmentNotFoundException("No attachment found");
        }else{
            this.fileName = fileName;
        }
    }
    

    @Override
    public void display() {
        super.display();
        System.out.println("Attachment: " + fileName);
    }
}

class MailBox {
    private List<Email> inbox;
    private List<Email> sent;
    private List<Email> spam;

    public MailBox() {
        inbox = new ArrayList<>();
        sent = new ArrayList<>();
        spam = new ArrayList<>();
    }

    public void addToInbox(Email email) {
        if (email.getSubject() != null && email.getSubject().toUpperCase().contains("WIN")){
            spam.add(email);
        } else {
            inbox.add(email);
        }
    }

    public void addToSent(Email email) {
        sent.add(email);
    }

    public void viewInbox() {
        for (Email e : inbox) {
            e.display();
        }
    }
    public void viewSent() {
        for (Email e : sent) {
            e.display();
        }
    }
    public void viewSpam() {
        for (Email e : spam) {
            e.display();
        }
    }
}


public class Rough {
    public static void main(String[] args) {
        System.out.println("==== EMAIL SYSTEM OUTPUT ====");

        try {
            User u1 = new User("a@gmail.com", "Alice");
            User u2 = new User("b@gmail.com", "Bob");

            Email e1 = new Email(u1.getEmailId(),u2.getEmailId(),"Hello","How are you?");

            Email e2 = new AttachmentEmail(u1.getEmailId(),u2.getEmailId(),"Notes","Check this file","file.pdf");
            Email spamMail = new Email(u1.getEmailId(),u2.getEmailId(),"WIN FREE MONEY NOW!!!","Click this link to claim your prize");
            
            u1.sendEmail(u2, e1);
            u1.sendEmail(u2, e2);
            u1.sendEmail(u2, spamMail);

            System.out.println(u2.getName() + "'s Inbox:");
            u2.getMailbox().viewInbox();

            System.out.println("\n" + u1.getName() + "'s Sent Emails:");
            u1.getMailbox().viewSent();

           System.out.println("\n"+u2.getName() + "'s Spam:");
            u2.getMailbox().viewSpam();

        } catch (InvalidEmailException e) {
            System.out.println("Invalid Email: " + e.getMessage());
        } catch (EmptyFieldException e) {
            System.out.println("Empty Field: " + e.getMessage());
        } catch (AttachmentNotFoundException e) {
            System.out.println("Attachment Error: " + e.getMessage());
        } catch (EmailNotSentException e) {
            System.out.println("Sending Failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}