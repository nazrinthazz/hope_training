@FunctionalInterface
interface Math{
    int add(int a, int b);
}
interface Exercise{
    void sayHello();
}

public class LambdaExample {
    public static void main(String [] args){
        //Math addFunc=(a,b)->a+b;//anonymous funtion

        
        Math addFunc=(a,b)->{
            System.out.println("Adding 2 numbers....");
            return a+b;
        };
        
        //Math addFunc=new Math(){
       //     public int add(int a, int b){
        //        return a+b;
        //   }
        //};
        //System.out.println(addFunc.add(22,33));

        Exercise hello=()->System.out.println("Hello");


        System.out.println(addFunc.add(22,33));
        hello.sayHello();
    }
}
