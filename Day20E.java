package Week4;
import java.util.Scanner;

public class Day20E {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String input1 = uInput.nextLine();
        int num1 = 0; 
        char[] chArr = new char[2];
        
        try {
            num1 = Integer.parseInt(input1);
            chArr[2] = 's'; // mag e error ito kasi hanggang index 1 lang yung array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index is larger than the array itself");
        } catch (NumberFormatException e) {
            System.out.println("User input an invalid number");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("converting complete");
        }
        
        num1 += 25;
        System.out.println("num1+25="+num1);
        
    }
}
