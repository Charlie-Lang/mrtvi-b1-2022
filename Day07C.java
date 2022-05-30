package mattrosejavab1compiled;
import java.util.Scanner;

// https://lucid.app/lucidchart/350510e2-c382-4db8-a244-283544d25bd4/view
public class Day07C {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        short num1 = 0;
        short num2 = 0;
        short num3 = 0;
        int result = 0;
        
        System.out.print("Enter 1st number: ");
        num1 = uInput.nextShort();
        System.out.print("Enter 2nd number: ");
        num2 = uInput.nextShort();
        System.out.print("Enter 3rd number: ");
        num3 = uInput.nextShort();
        
        result = num1 + num2 + num3;
        
        System.out.println("The sum of the 3 numbers = " + result);
                
    }
}
