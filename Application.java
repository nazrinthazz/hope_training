class User{
    String name;
    String role="User";
    String phone;
    String address;
    public User(String name,String role) {
        this.name = name;
        this.role = role;

    }
    public User() {
        System.out.println("User Class");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Role:"+role);
    }
}
class FoodUser extends User{
    String FavFood;

    public FoodUser() {
        System.out.println("Food user Class");
    }

}
class TravelUser extends User{
    String freqLocation;

    public TravelUser() {
         System.out.println("Travel user Class");
    }
    
}
class Driver extends User{
    String vehicle;
    String role="Driver";
    public Driver(String name,String vehicle) {
        super(name,"Driver");
        this.vehicle = vehicle;
    }
    void displayDriver(){
        System.out.println("Vehile:"+vehicle);
        System.out.println("Driver class role:"+role);
        System.out.println("user class role:"+super.role);
    }
    

}
public class Application {
    public static void main(String[] args){
        User u=new User("Arjun","FoodUser");
        u.display();
        User d=new Driver("Bobo","Auto");
        d.display();
        ((Driver) d).displayDriver();
    }
}