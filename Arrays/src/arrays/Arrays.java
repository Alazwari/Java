
package arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        String name = "Abdulrahman";
        System.out.println(name);
        
        String allnames[] = new String[6];
        allnames[0] = "Mayar";
        allnames[1] = "Eyas";
        System.out.println(allnames[0]);
        System.out.println(allnames[1]);
        System.out.println(allnames[2]);
        System.out.println(allnames.length);
        for(int i = 0; i<allnames.length; i++){
            System.out.println(allnames[i]);
        }
        
        int numbers[] = new int[6];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        for(int x = 0; x < numbers.length; x++){
            System.out.println(numbers[x]);
        }
        
        ////////////Ex1
        Scanner scan =  new Scanner(System.in);
        String names[] = new String[5];
        int grades[] = new int[5];
        
        for(int x =0; x<names.length; x++){
            System.out.println("Enter student #" + (x +1) + " ... ");
            names[x] = scan.next();
            System.out.println("Enter garde #" + (x +1) + " ... ");
            grades[x] = scan.nextInt();
            
        }
        
        for(int y=0; y <grades.length; y++){
            System.out.println("Student #" + (y +1) + " " + names[y] + ", the grade is " + grades[y]);
        }
        
    }
    
}
