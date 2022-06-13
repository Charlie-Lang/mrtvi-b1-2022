package Week4;

public class Day19D {
    public static void main(String[] args) {
        computeNumbers(12, 47);
        computeNumbers(48,22,17,85);
    }
    
    public static void computeNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1+"+"+num2+"="+result);        
    }
    
    public static void computeNumbers(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println(num1+"+"+num2+"="+result);        
    }
    
    public static void computeNumbers(int num1, int num2, int num3, int num4) {
        int result = num1 + num2 + num3 + num4;
        System.out.println(num1+"+"+num2+"+"+num3+"+"+num4+"="+result);        
    }
}
