import java.util.*;
public class String_Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String s=sc.nextLine();
        String[] a=s.split(" ");
        System.out.print("No. of words: "+a.length);
    }
}
