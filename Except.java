public class Except {
    public static void main(String[] args){
        try{
            //int a=8,b=0;
            //int c=a/b;
            String c = null;
            System.out.println(c.length());
        }catch(ArithmeticException e){
            System.out.println("Number is divided by zero");
        }
        catch(NullPointerException e){
            System.out.println("String value is null");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
