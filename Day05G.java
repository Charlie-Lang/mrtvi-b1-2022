package mattrosejavab1compiled;
import java.util.Scanner;
// ^ always import if you want user input


public class Day05G {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        // this object is created in order to use the Scanner class
        
        String txt1 = "";
        String txt2 = "";
        
        System.out.println("Please enter first word ");
        txt1 = uInput.nextLine();
        System.out.println("Please enter second word: ");
        txt2 = uInput.nextLine();
        System.out.println("\n"+txt1+" "+txt2+"\n");
    }
    
    void sample() {
        String txt3 = new Scanner(System.in).nextLine();
    }
}
