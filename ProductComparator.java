import java.util.*;

class Product{
    String name;
    int price;
    double rating;
    public Product(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String toString(){
        return name+" - $"+price+" - "+rating;
    }
    
}
public class ProductComparator {
    public static void main(String[] args){
        List<Product>p=new ArrayList<Product>();
        p.add(new Product("Pears", 65, 4.3));
        p.add(new Product("CloseUp", 45, 3.3));
        p.add(new Product("Apple", 50, 2.3));
        p.add(new Product("Bourbon", 20, 4.0));
        p.add(new Product("Dark Fantasy", 50, 4.9));

        //Method 1
        Comparator<Product> byRating=new Comparator<Product>() {
            public int compare(Product a, Product b){
                return Double.compare(a.rating,b.rating);
            }
        };
        Collections.sort(p,byRating);
        System.out.println(p);

        //Method 2
        Collections.sort(p,(a,b)->a.name.compareTo(b.name));
        System.out.println("Compare by name:"+p);

        p.sort(Comparator.comparingDouble(a -> a.rating));
        System.out.println("Compare by rating:"+p);

        Collections.sort(p,(a,b)->Integer.compare(a.price,b.price));
        System.out.println("Compare by price:"+p);

       

    }
}
