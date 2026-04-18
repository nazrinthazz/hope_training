public class test {
    public static void main(String[] args){
        Student s1=new Student();
        System.out.println(s1.rollno);
        Student s2=new Student();
        System.out.println(s2.name);

    }
}
class Student{
    int rollno=11;
    String name="abc";
    int marks=44;
}