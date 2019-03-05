package ternary;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.util.Date date = new java.util.Date();
        java.text.SimpleDateFormat sd = new java.text.SimpleDateFormat("dd:mm:yy");

        System.out.println("Enter a number ...");
        int number = scan.nextInt();
        
        String check = (number == 5)? "Five" : "736";
        System.out.println(check);
        
        //////////Date
        
        System.out.println(date);
        System.out.println(sd.format(date));
        
        

    }

}
