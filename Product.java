public class Product {
    int id;
    String name;
    double price;
    int quantity;
    Product(int id, String n,double p, int q){
        this.id=id;
        name=n;
        price=p;
        quantity=q;
    }
    double getTotalPrice(){
        return price*quantity;
    } 
    void display(){
        System.out.println("Product ID:"+id);
        System.out.println("Produc name:"+name);
        System.out.println("Product price:$"+price);
        System.out.println("Quantity of product:"+quantity);
         System.out.println("Total Price:$"+getTotalPrice());
        System.out.println("----------------------------");

    }
    public static void main(String[] args){
        Product p1=new Product(101,"Lays",10.00,5);
        Product p2=new Product(102,"Soap",59.99,3);
        Product p3=new Product(103,"Icecream",40.99,6);
        Product[] cart={p1,p2,p3};
        double grandTotal=0;
        for(Product p:cart){
            p.display();
            grandTotal+=p.getTotalPrice();
        }
        System.out.print("Grand Total:$"+grandTotal);
    }
}