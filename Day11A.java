package Week2;
import java.util.Scanner;

// this is the yesterday's assignment
public class Day11A {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int steps = 0;
        
        System.out.print("Enter a number: ");
        steps = uInput.nextInt();
        
        for (int i = 0; i < steps; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println("");
        }
        
    }
}
