import java.util.Scanner;

public class Pattern_II {
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     for(int i=a;i>0;i--,System.out.println()){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
     }
    }
}
