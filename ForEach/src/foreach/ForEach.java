
package foreach;
import java.util.Scanner;


public class ForEach {

    public static void main(String[] args) {
        java.util.List<String> newList = new java.util.ArrayList<>();
        
        newList.add("Abdulrahman");
        newList.add("Fahad");
        newList.add("Hassan");
        
        for(String myList : newList){
            System.out.println(myList);
        }
        
        int nums[] = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        
        for(int i : nums){
            System.out.println(i);
        }
        
        java.util.List<String> list = new java.util.ArrayList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");
        
        list.forEach((alpha) -> {
            System.out.println(alpha);
        });
        list.forEach((alpha)->{
            System.out.println(alpha);
        });
        
    }
    
}
