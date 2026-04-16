import java.io.*;

public class DeSerializationExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fi=new FileInputStream("Student.txt");
        ObjectInputStream ObjStream =new ObjectInputStream(fi);
        while(true){
            try{
                Student s=(Student)ObjStream.readObject();
                System.out.println(s.name+" "+s.marks);
            }catch(EOFException e){
                break;
            }
        }
        
        fi.close();
        ObjStream.close();
    }
}
