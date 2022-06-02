package Week2;
import java.util.Scanner;

public class Day10B {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        
        int numIn = 0;
        int numTotal = 0;
        
        System.out.print("Enter a number: ");
        numIn = uInput.nextInt();
        
        for (int i = 1; i <= numIn; i++) {
            numTotal += i; // numTotal = numTotal + i;
            System.out.print(i);
            if (i < numIn) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+numTotal);
        //changing it to something similar to 1+2+3+4=10
        
        System.out.println("");
        System.out.println("Total of adding all the numbers from 1 to "
            + numIn + ": " + numTotal);// the assignment output
    }
}
