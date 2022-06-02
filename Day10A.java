package Week2;

// Code version of this: https://imgur.com/a/ETdM3lU
public class Day10A {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int numS = 0;
        int numM = 0;
        int numL = 0;
        
        num1 = 9;
        num2 = 12;
        num3 = 7;
        
        if (num1 > num2) {
            if (num1 > num3) {
                numL = num1;
                if (num3 > num2) {
                    numM = num3;
                    numS = num2;
                } else {
                    numM = num2;
                    numS = num3;
                }
            } else {
                numL = num3;
                numM = num1;
                numS = num2;
            }
        } else {
            if (num2 > num3) {
                numL = num2;
                if (num3 > num1) {
                    numM = num3;
                    numS = num1;
                } else {
                    numM = num1;
                    numS = num3;
                }
            } else {
                numL = num3;
                numM = num2;
                numS = num1;
            }
        }
        System.out.println("The numbers are "+numS+", "+numM+", "+numL);
    }
    
}
