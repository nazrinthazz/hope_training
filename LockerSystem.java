class Locker{
    private int lockerId;
    private boolean isLocked;
    private int pin;
    private String storedItem;

    public Locker(int lockerId, boolean isLocked, int pin) {
        this.lockerId= lockerId;
        this.isLocked = isLocked;
        this.pin = pin;
    }
    public void storeItem(String item, int pin){
        if(!isLocked){
            if(this.pin==pin ){
                if(storedItem==null){
                    storedItem=item;
                    System.out.println(item + " stored successfully");
                }else{
                    System.out.println("Locked is already occupied");
                }  
            } else System.out.println("Invalid pin...");
        }else{
            System.out.println("Locker is locked ... unlock the locker");
        }
    }
    public void lock(){
        isLocked=true;
        System.out.println("Locker "+lockerId+ " Locked !!!");
    } 
 
    public void unlock(int p){
        if(!isLocked){
            System.out.println("Locker is already unlocked");
        }else if(pin==p){
            isLocked=false;
            System.out.println("Locker "+lockerId+" unlocked");
        }else System.out.println("Invalid pin please try again");
    }

    public void getStoredItem(int pin) {
        if (storedItem == null) {
            System.out.println("Locker is empty");
            return;
        }

        if (isLocked) {
            System.out.println("Locker is locked");
            return;
        }

        if (this.pin == pin) {
            System.out.println("Retrieved: " + storedItem);
            storedItem = null;
        } else {
            lock();
            System.out.println("Invalid pin...");
        }
    }

}

public class LockerSystem {
    public static void main(String[] args) {
        Locker l=new Locker(111, true, 10101);
        //Store Item
        System.out.println("Storing an item");
        l.unlock(10101);
        l.storeItem("Jewellery", 10101);
        l.lock();
        //Retreival of item
        System.out.println("Proper retreival and locking:");
        l.unlock(10101);
        l.getStoredItem(10101);
        l.lock();
        l.getStoredItem(10101);

    }
}
