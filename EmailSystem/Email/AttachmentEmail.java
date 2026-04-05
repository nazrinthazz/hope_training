package EmailSystem.Email;
import EmailSystem.Exception.*;

public class AttachmentEmail extends Email {
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
