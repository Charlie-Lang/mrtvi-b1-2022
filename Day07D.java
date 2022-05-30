package mattrosejavab1compiled;
import java.util.Scanner;
        
// https://lucid.app/lucidchart/350510e2-c382-4db8-a244-283544d25bd4/view?page=nsUkI4AnDAoA#
public class Day07D {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String dayName = "";
                
        System.out.println("Enter a day of the week");
        dayName = uInput.nextLine();
                
        if (dayName.equals("Saturday")) {
            System.out.println("Weekends begins");
        }
    }
}
