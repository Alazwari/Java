
package tryandcatch;

import static java.lang.System.out;
import javax.swing.JOptionPane;

public class TryAndCatch {
    
    public static void main(String[] args) {
        
        try{
            
            int num1 = 0;
            int num2 = 0;
            int r = num1 / num2;
            out.println(r);
            
        }catch(Exception ex){
            
            if(ex.getMessage().equals("/ by zero")){
                out.println("Error : Divided by zaero");
                JOptionPane.showMessageDialog(null, "\"Error : Divided by zaero");
                
            }else{
                out.println("Error!!!");
            }
          
        }
        
    }
    
}
