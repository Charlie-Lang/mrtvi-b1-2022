package Week3;

public class Day15A {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 92;
        int num3 = 107;
        int numLargest = 0;
        int numSmallest = 0;
        
        
        numLargest = Math.max(num1, num2);
        numLargest = Math.max(numLargest, num3);
        numSmallest = Math.min(num1, num2);
        numSmallest = Math.min(numSmallest, num3);
        
        System.out.println("bet num1 and num2: " + numLargest 
                + " is larger than " + numSmallest);
    }
}
