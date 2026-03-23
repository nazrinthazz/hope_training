import java.util.Scanner;

public class Pattern_V {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //for (int i=a;i>0;i--) {
            //for (int k=0;k<i-1;k++) {
            //    System.out.print(" ");
            //}
            //for (int l=0;l<(2*(a-i))+1;l++) {
             //  System.out.print("*");
            //}
           // System.out.println();
        //}
        //for (int i=a-1;i>0;i--){
            //for (int k=0;k<a-i;k++){
               // System.out.print(" ");
            //}
            //for (int l=1;l<=2*i-1;l++){
            //    System.out.print("*");
            //}
            //System.out.println();
        //}
        for(int i=0;i<a;i++,System.out.println()){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }
     for(int i=a-1;i>0;i--,System.out.println()){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
     }
    }
}
