package Week4;

public class Day20D {
    public static void main(String[] args) {
        Day20Compute callCompute = new Day20Compute();
        callCompute.setNum1(12.87);
        callCompute.setNum2(46.98);
        callCompute.setOperator("/");
        
        System.out.println(callCompute.getNum1()
                +callCompute.getOperator()
                +callCompute.getNum2()
                +"="+callCompute.getResult());
    }
}
