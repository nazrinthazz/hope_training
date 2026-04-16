import java.io.*;
class Student implements Serializable{//no variable or method in Serializable ...
    String name;
    int marks;
    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream fo)throws IOException{
        super(fo);
    }
    @Override
    protected void writeStreamHeader(){
        //header is created only once
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException{
        Student s=new Student("Ashwin",99);//if run again it would be over written
        File file=new File("Student.txt");
        FileOutputStream fo=new FileOutputStream(file,true);//open file... to avoid overWriting...
        //ObjectOutputStream objStream=new ObjectOutputStream(fo);//obj to byte stream
        ObjectOutputStream objStream;
       
        if(file.length()==0){
            objStream=new ObjectOutputStream(fo);//first time serialization
        }else{
            objStream=new CustomObjectOutputStream(fo);//appending to the existing sile
        } 
        objStream.writeObject(s);//writing on file
        fo.close();
        objStream.close();
    }
}
