package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number ....");
        int number = scan.nextInt();
        
        switch(number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Three or more than that ....");
        }
    }
    
}
