package mattrosejavab1compiled;
import java.util.Scanner;

public class Day07A {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        
        String name = "";
        byte age = 0;
        String address = "";
        
        System.out.print("Name: ");
        name = uInput.nextLine();
        System.out.print("Age: ");
        age = uInput.nextByte();
        uInput.nextLine();
        System.out.print("City: ");
        address = uInput.nextLine();
        
        System.out.println("My name is " + name + ". I'm " + age 
                + " years old and I live at " + address);
    }    // TRY NINYO 9:05 TULOY NATIN!!!
}
