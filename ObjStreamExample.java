import java.util.List;
import java.util.jar.Attributes.Name;

class Employee{
    String name,Department;
    int salary,age;

    Employee(String name,String Department,int salary,int age){
        this.name=name;
        this.Department=Department;
        this.salary=salary;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return Department;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name+" $"+salary;
    }
}

public class ObjStreamExample {
    public static void main(String[] args) {
        List<Employee>emp=List.of(new Employee("Raja","HR",10000,22),new Employee("Asha","Dev", 90000,30),new Employee("Rashi","support", 85000,34));
       
        List<Employee>hr=emp.stream().filter((i)->i.getDepartment().equalsIgnoreCase("dev")).toList();
        System.out.println("Dev:"+hr.toString());
        
        List<Employee>sal=emp.stream().filter((i)->i.getSalary()>50000).toList();
        System.out.println("Salary greater than 50000:"+sal);

        int total=emp.stream().map((i)->i.getSalary()).reduce(0,(a,b)->a+b);
        System.out.println("Sum of all Salary :"+total);

        double avg=emp.stream().mapToInt((i)->i.getSalary()).average().orElse(0);
        System.out.println("Average of all Salary :"+(int)avg);

        long cnt =emp.stream().count();
        System.out.println("No. of Employee :"+cnt);
    }
}
