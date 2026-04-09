//Comparator
// it needs compare() to be overridden externally(outiside the class)
// can sort based on any parameter or variable

import java.util.*;

class Student{
    int id;
    String name;
    int mark;
    @Override
    public String toString(){
        return id+" - "+name+" - "+mark;
    }
    
    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}


public class ComparatorExample {
    public static void main(String[] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student(6,"Arjun",85));
        s.add(new Student(7,"Ashwin",95));
        s.add(new Student(5,"Tejalakshmi",98));
        s.add(new Student(4,"Dhanya",99));
        s.add(new Student(2,"Akshaya",97));

        //Method 1 ascending
        Comparator<Student>byId=new Comparator<Student>(){
            public int compare(Student a, Student b){
                return a.id-b.id;
            }
        };
        Collections.sort(s,byId);
        System.out.println(s);

        //Method 1 descending
        Comparator<Student>byMark=new Comparator<Student>(){
            public int compare(Student a, Student b){
                return b.mark-a.mark;
            }
        };
        Collections.sort(s,byMark);
        System.out.println(s);

        //Method 1 String 
        Comparator<Student> byName = new Comparator<Student>(){
            public int compare(Student a, Student b){
                return a.name.compareTo(b.name);
            }
        };
        Collections.sort(s,byName);
        System.out.println(s);

        //Method 2 Ascending
        Collections.sort(s, (a, b) -> Integer.compare(b.mark, a.mark));
        Collections.sort(s, (a, b) -> Integer.compare(a.mark, b.mark));
    

        //method2 String
        Collections.sort(s, (a, b) -> a.name.compareTo(b.name));
        Collections.sort(s, (a, b) -> b.name.compareTo(a.name));// reverse

        //method 3
        s.sort(Comparator.comparingInt(a -> a.id));
        s.sort(Comparator.comparingInt((Student a) -> a.mark).reversed());

        //Method 3 String
        s.sort(Comparator.comparing(a -> a.name));
        s.sort(Comparator.comparing((Student a) -> a.name).reversed());
        Collections.sort(s, Collections.reverseOrder());
    }

}
