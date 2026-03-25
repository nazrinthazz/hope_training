class Notification {
    String name;
    String message;
    void send(){
        System.out.println("Sending notifacation from parent class");
    }
    void receive(){//accessed from child class
        System.out.println("Received..!!!!");
    }
    public Notification(String name, String message) {
        this.name = name;
        this.message = message;
    }
    
}
class Email extends Notification{
    void send(){
        System.out.println("Sending Email Notification to: "+name);
        System.out.println("Mesage:"+message);
    }
    void change(){//Can't be accessed from parent class unless defined in parent class
        System.out.println("Edit Notification");
        message="Hi I am Thaslima";
        System.out.println("New Message:"+message);
    }
    public Email(String name, String message) {
        super(name, message);
    }
    
    
}
class SMS extends Notification{
    void send(){
        System.out.println("Sending SMS notification to: "+name);
        System.out.println("Mesage:"+message);
    }

    public SMS(String name, String message) {
        super(name, message);
    }
}

public class Notify {
    public static void main(String[] args){
        Notification n;
        n=new SMS("Arjun","Happy Birthday!!!");
        n.send();
        n.receive();
        n=new Email("Teja","Thank you!!!");
        n.send();
        Email e=new Email("Anisha", "Sorry...");
        e.send();
        e.change();
        e.send();
        e.receive();

    }
}
