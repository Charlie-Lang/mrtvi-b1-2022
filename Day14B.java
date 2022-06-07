package Week3;

public class Day14B {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 92;
        int numLargest = 0;
        int numSmallest = 0;
        
        int[] numArray = {12,44,20,19,18,4,26,32};
        
        numLargest = Math.max(num1, num2);
        numSmallest = Math.min(num1, num2);
        
        System.out.println("bet num1 and num2: " + numLargest 
                + " is larger than " + numSmallest);
        
        System.out.println("\nNumber List:");
        for (int i : numArray) {
            System.out.println(i);
            numLargest = Math.max(numLargest, i);
            numSmallest = Math.min(numSmallest, i);
        }
        
        System.out.println("Largest: " + numLargest);
        System.out.println("Smol: " + numSmallest);
        
    }
}
