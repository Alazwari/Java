package ifstatement;

public class IfStatement {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        String name = "";
        System.out.println("What is your name? ...");
        name = scan.next();
        System.out.println(name);
//        لمقارنة
//        string
//        نستخدم
//        equlals
        if(name.equals("Abdulrahmn")){
            System.out.println("Hello Abdulrahman");
        }else if(name.equals("Mayar")){
            System.out.println("Hello Mayar");
        }else{
            System.out.println("Hi!");
        }
    }
    
}
