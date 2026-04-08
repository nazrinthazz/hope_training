import java.util.*;
public class setExample {
    public static void main(String[] args) {
        Set<Integer>Lset=new LinkedHashSet<>();
        Set<Integer>Hset=new HashSet<>();
        int[] arr={2,3,6,1,7,4,54,23};
        for(int n:arr){
            Lset.add(n);
            Hset.add(n);
        }
        System.out.println(Lset);//SAME AS INPUT
        System.out.println(Hset);//NOT ORDERED
    }
}
