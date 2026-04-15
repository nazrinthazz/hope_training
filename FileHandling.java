import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args){
        try{
            File newFile=new File("test.txt");
            System.out.println("Path created");
            newFile.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
        
       
    }
}
