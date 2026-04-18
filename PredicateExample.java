import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark = mark;
    }
}
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Student> isPass=(s)->s.mark>45;

        //Predicate<Integer>isEven=(n)->n%2==0;

        Predicate<Integer> isEven=new Predicate<Integer>(){
            public boolean test(Integer n){//always test... as this is built in
                return n%2==0;
            }
        };
        
        isEven.and(n -> n > 10).test(12); // true

        isEven.or(n -> n > 100).test(101); // true

        isEven.negate().test(3); // true (odd)

        System.out.println(isPass.test(new Student(45)));
        System.out.println(isEven.test(99999));
    }
}
