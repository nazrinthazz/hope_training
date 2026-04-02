package src.com.ecommerce.Main;
import src.com.ecommerce.Model.*;
import src.com.ecommerce.Service.*;
public class Main {
    public static void main(String[] args){
        User u=new User("Arjun","Erode");
        Product p=new Product("Shirt",200.0);
        Order o=new Order( p,u,4);
        OrderService service=new OrderService();
        service.placeOrder(o);
    }
}
