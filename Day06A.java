package mattrosejavab1compiled;
import java.util.Scanner; // step 1

public class Day06A {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in); // step 2
        
        String txt1 = ""; //step 3
        int num1 = 0;
        System.out.print("Type anything: ");
        txt1 = uInput.nextLine();
        System.out.print("Type a number: ");
        num1 = uInput.nextInt();
        
        System.out.println();
        System.out.println("----"+txt1+"----"+num1);
    }    
}
// paano gumamit ng scanner
// 1. import mo si scanner
// 2. Gumawa ng object para hawakan yung scanner
// 3. gumawa ka ng variable na paglalagyan ng user input mo
// 3.a. Gumamit ng tamang data type para sa user input
// 4. Gamitin yung object sa step 2 para malagyan ng
//        value yung variable sa step 3
// 4.a. Gamitin ang tamang method sa loob ni scanner
//          nextLine()
//          nextByte()
//          nextShort()
//          nextInt()
//          nextLong()
//          nextDouble()
//          nextFloat()
//          nextBoolean()