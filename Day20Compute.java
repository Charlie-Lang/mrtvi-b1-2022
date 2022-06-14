package Week4;

public class Day20Compute {
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "+";
    private double result = 0;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    private double compute(double num1, double num2, String operator){
        double result = 0;
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
                result=0;
        }
        return result;
    }
    
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }

    public double getResult() {
        result = compute(num1, num2, operator);
        return result;
    }
    
    
    
    
    
    
}
