//COMPARABLE INTERFACE
//Natural ordering default method of sorting
///CompareTo() method -> the sorting is costant 
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name, int mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s){
        return Integer.compare(this.mark, s.mark);// calsulates the diff b/w this.mark-s.mark...(if diff>0)a->b else b->
        //return s.mark-this.mark; -> might cause integer overflow...
    }

    @Override
    public String  toString(){
        return name +"->"+mark;
    }
}

public class ComparableExample {
    public static void main(String[] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student("A",85));
        s.add(new Student("B", 70));
        s.add(new Student("c", 95));
        s.add(new Student("D", 67));
        Collections.sort(s);
        System.out.println(s);
        //for(Student a:s){
        //   System.out.println("Student name: "+a.name+" marks obtained: "+a.mark);
        //}

    }
}
