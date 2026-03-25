class User{
    String name;
    String phoneNo;
    String address;
    String booking="User";
    public User(String name,String phoneNo, String address) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Phone No:"+phoneNo);
        System.out.println("Address:"+address);
    }
}
class Ride extends User{
    String booking="Ride";
    String vehicle;
    public Ride(String name, String phoneNo, String address, String vehicle) {
        super(name,phoneNo, address);
        this.vehicle = vehicle;
    }
    void displayRide(){
        super.displayInfo();
        System.out.println("Vehicle:"+vehicle);
    }

}
class Food extends User{
    String price;
    String dish;
    String booking="Food";
    public Food(String name, String phoneNo, String address, String price, String dish) {
        super(name,phoneNo, address);
        this.name = name;
        this.price = price;
        this.dish = dish;
    }
    void displayFood(){
        super.displayInfo();
        System.out.println("Price:"+price);
        System.out.println("Favourite food:"+dish);
    }

}
class Parcel extends User{
    String source;
    String destination;
    String item;
    String booking="Parcel";
    float parcelWeight;
    public Parcel(String name, String phoneNo, String address, String item,float parcelWeight) {
        super(name,phoneNo, address);
        this.item = item;
        this.parcelWeight=parcelWeight;
    }
    void displayParcel(){
        super.displayInfo();
        System.out.println("Item:"+item);
        System.out.println("Parcel weight :"+parcelWeight);
    }

}
public class Booking {
    public static void main(String[] args) {
        System.out.println("----------------------------------\nUser details:");
        User s= new User("Arjun","1234567890","Chennai");
        s.displayInfo();
        System.out.println("----------------------------------\nRider details:");
        Ride r=new Ride("Ashwin","3123456789","Bangalore","Car");
        r. displayRide();
        System.out.println("----------------------------------\nFood order details:");
        Food f=new Food("Arya","8756482901","Cuddalore","200","Pizza");
        f. displayFood();
        System.out.println("----------------------------------\nParcel details:");
        Parcel p=new Parcel("Anisha","9874567927","Coimbatore","Books",(float) 1.540);
        p.displayParcel();
        System.out.println("----------------------------------");
    } 
}
