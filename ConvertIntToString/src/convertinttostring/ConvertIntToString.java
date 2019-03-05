package convertinttostring;
import java.util.Scanner;
public class ConvertIntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 2019;
        String year = String.valueOf(num);
        int again = Integer.parseInt(year);
        System.out.println(year);
        System.out.println(again);
    }
    
}
