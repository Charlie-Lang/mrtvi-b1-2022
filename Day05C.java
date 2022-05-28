package mattrosejavab1compiled;

// unary operators
// better known for increment and decrement
public class Day05C {
    public static void main(String[] args) {
        int num1 = 10;
        
        System.out.println("++num1: " + ++num1); // naganap yung +1 bago print
        num1 = 10;
        System.out.println("num1++: " + num1++); // print muna bago +1
        System.out.println("after result: " + num1);
        num1 = 10;
        System.out.println("--num1: " + --num1);
        num1 = 10;
        System.out.println("num1--: " + num1--);
        System.out.println("after result: " + num1);
    }
}
