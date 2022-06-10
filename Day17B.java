package Week3;
import java.util.Scanner;

public class Day17B {
    public static void main(String[] args) {
        Day17B callMe = new Day17B();
        Scanner uInput = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String operator = "+";
        
        System.out.print("Enter 1st Number: ");
        num1 = uInput.nextDouble();
        System.out.print("Enter 2nd Number: ");
        num2 = uInput.nextDouble();
        uInput.nextLine();
        System.out.print("Enter operator(+,-,*,/): ");
        operator = uInput.nextLine();
        
        System.out.println("calculator that we move the computation on a different method");
        callMe.compute(num1, num2, operator);
    }
    
    private void compute(double num1, double num2, String operator){
        double result = 0;
        boolean opValid = true;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Operator is not accepted");
                opValid = false;
        }
        if (opValid) {
            System.out.println(num1+operator+num2+"="+result);
        }
    }
}
