package Week3;

public class Day15B {
    public static void main(String[] args) {
        int[] numArray = {18,19,44,12,20,4,26,32};
        
        int numLargest = 0;
        int numSmallest = numArray[0]; 
        // di pwede 0 kasi pag ganun more likely
        // mas malaki sa 0 ang laman ng array
        
        for (int i : numArray) {
            numLargest = Math.max(numLargest, i);
            numSmallest = Math.min(numSmallest, i);
        }
        
        System.out.println("The largest number in the array is " + numLargest);
        System.out.println("The smallest number in the array is " + numSmallest);
        
    }
}
