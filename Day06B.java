package mattrosejavab1compiled;
import java.util.Scanner;

// what if you dont want to create an object for the Scanner class?
public class Day06B {
    public static void main(String[] args) {
        String txt1 = "";
        String txt2 = "";
        
        System.out.println("Text 1: ");
        txt1 = new Scanner(System.in).nextLine();
        System.out.println("Text 2: ");
        txt2 = new Scanner(System.in).nextLine();
        // the new Scanner(System.in) must be called everytime it is used
    }
}
