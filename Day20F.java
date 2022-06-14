package Week4;

public class Day20F {
    public static void main(String[] args) {
        Day20F callMe = new Day20F();
        String txt1 = "123";
        double num1 = callMe.numberChecker(txt1)
                ? Double.parseDouble(txt1) : 0;
        System.out.println(num1);
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
