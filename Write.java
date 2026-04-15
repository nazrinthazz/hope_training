import java.io.*;

public class Write {
    public static void main(String[] args) {
        try{
            //FileWriter writer=new FileWriter("test.txt");   -> slow
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt")); // fast 
            writer.write("write using Buffered writer");
            writer.newLine();// only in buffered writer
             writer.write("write using Buffered writer");
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
