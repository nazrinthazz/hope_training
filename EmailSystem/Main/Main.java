package EmailSystem.Main;

import EmailSystem.Email.*;
import EmailSystem.Exception.*;
import EmailSystem.User.User;

public class Main {
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
