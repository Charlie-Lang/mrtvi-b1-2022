package mattrosejavab1compiled;
import java.util.Scanner;

// a user can choose a number of their selected color
// then the output will show which 3 colors chosen
public class Day06D {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String[] rainbow = {"red"
                ,"orange"
                ,"yellow"
                ,"green"
                ,"blue"
                ,"indigo"
                ,"violet"};
        int count = 0;
        byte numColor1 = 0;
        byte numColor2 = 0;
        byte numColor3 = 0;
        
        System.out.println("type the number of the color of your choice");
        System.out.println(count+" - "+rainbow[count++]);
        System.out.println(count+" - "+rainbow[count++]);
        System.out.println(count+" - "+rainbow[count++]);
        System.out.println(count+" - "+rainbow[count++]);
        System.out.println(count+" - "+rainbow[count++]);
        System.out.println(count+" - "+rainbow[count++]);
        System.out.println(count+" - "+rainbow[count++]);
        // ang variable pwede sya gamitin sa isang println ng maraming ulit
        
        System.out.print("\nEnter the number of 1st color: ");
        numColor1 = uInput.nextByte();
        System.out.print("Enter the number of 2nd color: ");
        numColor2 = uInput.nextByte();
        System.out.print("Enter the number of 3rd color: ");
        numColor3 = uInput.nextByte();
        
        System.out.println("\nThe selected colors are "
            + rainbow[numColor1] + ", "
            + rainbow[numColor2] + " and "
            + rainbow[numColor3]);
    }
}
