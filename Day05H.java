package mattrosejavab1compiled;
import java.util.Scanner;
// ^ always import if you want user input


public class Day05H {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        // this object is created in order to use the Scanner class
        double num1 = 0;
        
        // Test if we can take a double data type and output its number +1
        System.out.println("Please enter a number: ");
        num1 = uInput.nextDouble();
        System.out.println("num1 + 1 = " + (num1 + 1));
    }
}
