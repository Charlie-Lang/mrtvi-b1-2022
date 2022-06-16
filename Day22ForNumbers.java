package Week4;

public class Day22ForNumbers {
    public void compute(double num1, double num2, String operator){
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
    
    public void numberArrayCompare(int[] numArray) {
        int numLargest = 0;
        int numSmallest = numArray[0]; 
        for (int i : numArray) {
            numLargest = Math.max(numLargest, i);
            numSmallest = Math.min(numSmallest, i);
        }
        System.out.println("The largest number in the array "+numLargest);
        System.out.println("The smallest number in the array "+numSmallest);
    }
    
    public boolean numberChecker(String numIn) {
        boolean isNum = true;
        try {
            Double.parseDouble(numIn);
        } catch (Exception e) {
            isNum = false;
        }
        return isNum;
    }

}
