package stars;
public class Stars {
    public static void main(String[] args) {
    
        for(int spc = 4, star = 0 ; spc >= 0; spc--, star+=2){
            for(int x = 0; x <= spc; x ++){
                System.out.print(" ");
            }
            for(int z = 0; z <=star; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
