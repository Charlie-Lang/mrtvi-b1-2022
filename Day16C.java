package Week3;

public class Day16C {
    public static void main(String[] args) {
        computeClass callCompClass = new computeClass();
        int num1 = 47;
        int num2 = 29;
        int resultMain = callCompClass.compute2(num1, num2);
        
        callCompClass.compute1(12,44);
        
        System.out.println(num1 + " + " + num2 
                + " = " + resultMain);
    }
}

class computeClass {
    public void compute1(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
    
    public int compute2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
