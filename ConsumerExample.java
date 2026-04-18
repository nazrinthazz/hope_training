import java.util.List;
import java.util.function.Consumer;

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String>printSring=(s)->System.out.println(s);
        Consumer<Student>printName=(s)->System.out.println(s.name);
        printSring.accept("From Consumer");
        printName.accept(new Student("Arjun"));
         
        List<String>names=List.of("abc","def","ghi");
         
        //names.forEach(name->System.out.println(name));

        //Shortcut for lambda function
        names.forEach(System.out::println);
    }
}
