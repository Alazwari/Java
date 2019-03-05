
package arraylists;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {
        java.util.List<String> namesList = new java.util.ArrayList<>();
        
        namesList.add("Abdulrahman");
        namesList.add("Ali");
        namesList.add("Hassan");
        
        namesList.remove(1);
        namesList.set(1, "Fahad");
        
        System.out.println(namesList.size());
        for(int i = 0; i<namesList.size(); i++){
            System.out.println(namesList.get(i));
        }
        
        

    }
    
}
