import java.util.ArrayList;

public class Wrapper {
    public static Integer test1(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        Integer b=Integer.valueOf("123");//return type -> object(Integer)
        Integer c=Integer.parseInt("0987");//return type -> int(int)
        int a=b;//unboxing->b.intValue();(internal Logic)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(test1("234"));

        Integer y=Integer.valueOf(128);//Integer y=128
        Integer x=Integer.valueOf(128);//Integer x=128
        System.out.println(x==y);//false beyond(-128 to 127) as it is integer ---> checks address/references
        System.out.println(x.equals(y));//checks the value and returns true(unboxed value comparison)

        int[] arr=new int[4];//faster -> primitive datatype
        ArrayList<Integer>list = new ArrayList<>();//slower
        list.add(10);//autoboxing
        int i=list.get(0);//unboxing
        System.out.println(i);


    }
}
