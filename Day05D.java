package mattrosejavab1compiled;

// sample about boolean
// and comparison operators
public class Day05D {
    public static void main(String[] args) {
        boolean compResult = false;
        int num1 = 10;
        int num2 = 10;
        compResult = num1 >= num2; // condition
        System.out.println("compResult: " + compResult);
        
        char ch1 = 'a';
        char ch2 = 'A';
        compResult = ch1 > ch2; // condition
        System.out.println("ch compResult: " + compResult);
        // Dont use == on String datatype
    }
}
