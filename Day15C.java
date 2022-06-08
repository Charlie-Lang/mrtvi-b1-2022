package Week3;

public class Day15C {
    public static void main(String[] args) {
        double num1 = 121;
        double num2 = 2197;
        double num3 = 2;
        double num4 = 7;
        double numResult = 0;
        
        numResult = Math.sqrt(num1);
        System.out.println("sqrt "+num1+" = "+numResult);
        
        numResult = Math.cbrt(num2);
        System.out.println("cbrt "+num2+" = "+numResult);
        
        numResult = Math.pow(num3, num4);
        System.out.println(num3+" raised to the "+num4+" is equal to: "+ numResult);
    }
}
