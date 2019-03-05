
package dowhile;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DoWhile {

    public static void main(String[] args) {
        
        do{
            System.out.println("---------------------\n"
                    + "DOB Program");
            System.out.println("What is your DOB ... ");
            Scanner scan = new Scanner(System.in);
            int dob = scan.nextInt();
            Date date = new Date();
            SimpleDateFormat sdate = new SimpleDateFormat("Y");
            int year =  Integer.parseInt(sdate.format(date));
            int newDOB = year - dob;
            
            System.out.println("Your Age is: " + newDOB + " years old."
                    + " Good luck!");
            System.out.println("---------------------\n");
            
        }while(false);
        
        
        

    }
    
}
