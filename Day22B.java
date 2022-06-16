package Week4;
import mrb2d22package2.*; // package of Day22ForNumbers and Day22ForString

public class Day22B {
    public static void main(String[] args) {
        Day22ForNumbers callNumClass = new Day22ForNumbers();
        Day22ForString callStrClass = new Day22ForString();
        int[] numArray = {23,44,17,63,12};
        String txt1 = "white fang";
        String txt2 = "call of the wild";
        
        callNumClass.numberArrayCompare(numArray);
        callNumClass.compute(12, 16, "+");
        
        System.out.println("");
        
        System.out.println(callStrClass.caps1stLetter(txt1));
        System.out.println(callStrClass.titleCaseSentence(txt2));
        
        
    }
}
