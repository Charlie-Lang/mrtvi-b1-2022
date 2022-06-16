package Week4;
//import java.util.*; // not good because we are only using 2 out of everything
import java.util.Scanner;
import java.util.ArrayList;

public class Day22A {
    static Scanner uInput = new Scanner(System.in);
    static ArrayList<String> strList = new ArrayList<String>();
    public static void main(String[] args) {
        System.out.print("Type something: ");
        strList.add(uInput.nextLine());
        System.out.print("Type more: ");
        strList.add(uInput.nextLine());
        System.out.print("Type one more time: ");
        strList.add(uInput.nextLine());
        
        for (String string : strList) {
            System.out.println(string);
        }
    }
}
