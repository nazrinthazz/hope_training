package src.com.ecommerce.Service;

import src.com.ecommerce.Model.Order;

public class OrderService{
    public void placeOrder(Order order){   
        System.out.println("User name: "+order.user.name);
        System.out.println("Product name: "+order.product.name);
        System.out.println("Quantity: "+ order.quantity);
        double total=order.product.price*order.quantity;
        System.out.println("Total Price: "+total);
    }
}
