package Week2;

public class Day11C {
    public static void main(String[] args) {
        int steps = 4;
        
        for (int i = 0; i < steps; i++) {
            for (int j = steps-1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                // the inner for loop decrement
            }
            for (int k = 0; k <= i-1; k++) {
                System.out.print("X");
            }
            System.out.println("");
        }
        // The output is a triangle with right sided corner
    }
}
