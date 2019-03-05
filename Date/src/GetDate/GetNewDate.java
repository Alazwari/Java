
package GetDate;

public class GetNewDate {
    
    public static void myDate(){
        java.util.Date  date = new java.util.Date();
        java.text.SimpleDateFormat formDate = new java.text.SimpleDateFormat("hh:MM:ss");
        System.out.println(formDate.format(date));
    } 
}
