package Week3;
import java.util.Scanner;

public class Day17A {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        String operator = "+";
        
        System.out.print("Enter 1st Number: ");
        num1 = uInput.nextDouble();
        System.out.print("Enter 2nd Number: ");
        num2 = uInput.nextDouble();
        uInput.nextLine();
        System.out.print("Enter operator(+,-,*,/): ");
        operator = uInput.nextLine();
        
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
        }
        //pabuo nga nung switch statement
        
        System.out.println(num1+operator+num2+"="+result);
    }
}
