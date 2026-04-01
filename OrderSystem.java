import java.lang.Math;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderProcessingException extends Exception {
    public OrderProcessingException(String msg) {
        super(msg);
    }
}
class Product{
    String p_name;
    int stock;
    double price;
    public Product(String p_name, int stock, double price) {
        this.p_name = p_name;
        this.stock = stock;
        this.price = price;
    }
    

}
class User{
    String name;
    String address;
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class Order{
    Product p;
    User u;
    int quantity;
    public Order(Product p, User u, int quantity) {
        this.p = p;
        this.u = u;
        this.quantity = quantity;
    }
    

}
class OrderService{
    void placeOrder(Order o)throws OutOfStockException, PaymentFailedException, OrderProcessingException{
        try{
             if(o.p.stock<=0){
                throw new OutOfStockException("Product out of stock");
            }
            if(Math.random() < 0.2){
                throw new PaymentFailedException("Payment Failed");
            }
            if(Math.random() < 0.4){
                throw new OrderProcessingException("Order Processing failed");
            }
            o.p.stock -= o.quantity;
            System.out.println("Order placed successfully");
        }catch(OutOfStockException e){
            System.out.println(e.getMessage());
        } catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        } catch(OrderProcessingException e){
            System.out.println(e.getMessage());
        }
       

    }

}

public class OrderSystem {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 5, 50000);
        User u = new User("Thaslima", "Chennai");
        Order o = new Order(p, u, 2);
        OrderService s=new OrderService();
        try{
            s.placeOrder(o);
        }catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        } catch(OrderProcessingException e){
            System.out.println(e.getMessage());
        }
    }

    
}
