import java.io.*;
public class Read {
    public static void main(String[] args) {
        try{
            BufferedReader fr=new BufferedReader(new FileReader("test.txt"));
            String ch;
            while((ch=fr.readLine())!=null){
                //returns ASCII
                // -1 when end of the file
                System.out.println(ch);
            }
            fr.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
     

    }
}
