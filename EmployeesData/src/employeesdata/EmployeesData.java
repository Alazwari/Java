package employeesdata;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class EmployeesData {

    public static void main(String[] args) {
        
        EmpForm f = new EmpForm();
        f.setVisible(true);
        f.setLocationRelativeTo(null);//في وسط الصفحة
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
}
