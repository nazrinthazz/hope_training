
import java.util.*;

class Employee{
    String name;
    int Salary;
    Employee(String name, int Salary){
        this.name=name;
        this.Salary=Salary;
    }
    public String toString(){
        return name+" : "+Salary;
    }
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Integer>numbs=List.of(2,3,4,5,6);
        List<Integer>multiplyBy2=numbs.stream().map((i)->i*2).toList();
        System.out.println(multiplyBy2); 

        //filter
        List<Integer>even=numbs.stream().filter((i)->i%2==0).toList();
        System.out.println(even); 
        
        //reduce
        int total=multiplyBy2.stream().reduce(0,(a,b)->a+b);//only works on map()
        //identity is initialisation
        System.out.println(total);

        //obj
        List<Employee>emp=List.of(new Employee("Raja",1000),new Employee("Asha", 9000),new Employee("Rashi", 8500));
        List<String>EmpNames=emp.stream().map((i)->i.getName()).toList();
        System.out.println(EmpNames);

        //obj filter
        List<Employee>EmpFilter=emp.stream().filter((i)->i.getSalary()>5000).toList();
        System.out.println(EmpFilter.toString());
    }
}
