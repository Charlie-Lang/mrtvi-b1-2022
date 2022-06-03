package Week2;

public class Day11B {
     public static void main(String[] args) {
        int steps = 6;
        
        for (int i = 0; i < steps; i++) {
            for (int j = steps-1; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                // the inner for loop decrement
            }
            System.out.println("");
        }
        // The output is a triangle with right sided corner
    }
}
