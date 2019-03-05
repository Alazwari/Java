package forloop;
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println();
        
//        String s1 = "", s2 = "", s3 = "";
//        int g1 = 0 , g2 = 0, g3 = 0;
//        
//        for(int x = 1; x <= 3; x++){
//            System.out.println("Enter S" + x +" name ...");
//            switch(x){
//                case 1:s1 = scan.next();break;
//                case 2:s2 = scan.next();break;
//                default:s3 = scan.next();break;
//            }
//            
//            System.out.println("Enter S" + x +" grade ...");
//            switch(x){
//                case 1:g1 = scan.nextInt();break;
//                case 2:g2 = scan.nextInt();break;
//                default:g3 = scan.nextInt();break;
//            }
//            
//        }
//
//        for(int y = 1; y<=3; y++){
//            System.out.println("Name of student #" + y + " is: " + y + ", and his grade is: " + g1);
//        }



for(int x = 1, y = 11 ; x <= 10 && y < 15 ; x++, y++){
    System.out.println("X = " + x + "  --  Y = " + y);
}
        
        
        
    }
    
}
