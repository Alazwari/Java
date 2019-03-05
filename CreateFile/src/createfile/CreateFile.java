package createfile;

import java.io.PrintWriter;
import static java.lang.System.out;

public class CreateFile {

    public static void main(String[] args) {
        
        try{
        PrintWriter w = new PrintWriter("newFile.txt");
        w.println("Hello world!!!");
        w.close();
        }catch(Exception ex){
            out.println("Error: " + ex.getMessage());
        }
        
    }
    
}
