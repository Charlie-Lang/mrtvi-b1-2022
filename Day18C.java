package mattroseb1d18;
import java.util.Scanner;

//1 of the means on using a class from a different file
public class Day18C {
    public static void main(String[] args) {
        Day18B callD18B = new Day18B(); // create object
        Scanner uInput = new Scanner(System.in);
        
        String txtIn = "";
        
        System.out.println("I will capitalize the 1st letter "
                + "of each word you typed:");
        txtIn = uInput.nextLine();
        
        System.out.println("------------");
        System.out.println(callD18B.titleCaseSentence(txtIn));
        
    }
}
