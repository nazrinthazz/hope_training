package EmailSystem.MailBox;
import java.util.*;

import EmailSystem.Email.Email;
public class MailBox {
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
