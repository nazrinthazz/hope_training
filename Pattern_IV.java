import java.util.Scanner;

public class Pattern_IV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=a;i>0;i--){
            for (int k=0;k<a-i;k++){
                System.out.print(" ");
            }
            for (int l=1;l<=2*i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
