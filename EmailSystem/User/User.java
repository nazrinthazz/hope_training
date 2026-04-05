package EmailSystem.User;

import EmailSystem.Email.Email;
import EmailSystem.Exception.*;
import EmailSystem.MailBox.MailBox;

public class User {
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
