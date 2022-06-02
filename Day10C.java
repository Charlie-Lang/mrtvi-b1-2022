package Week2;
import java.util.Arrays;

public class Day10C {
    public static void main(String[] args) {
        String[] txtArray1;
        
        txtArray1 = new String[7];
        
        txtArray1[0] = "eggs";
        txtArray1[1] = "hotdogs";
        txtArray1[2] = "green peas";
        txtArray1[3] = "carrots";
        txtArray1[4] = "rice";
        txtArray1[5] = "bacon bits";
        txtArray1[6] = "shrimp";
        
        System.out.println(txtArray1.length);
        
        for (int i = 0; i < txtArray1.length; i++) {
            System.out.println(txtArray1[i]);
        }
        
        System.out.println("");
        
        Arrays.sort(txtArray1);
        
        for (int i = 0; i < txtArray1.length; i++) {
            System.out.println(txtArray1[i]);
        }
    }
}
