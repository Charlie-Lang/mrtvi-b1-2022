package Week2;
import java.util.Scanner;

// nested if version of 1st flowchart from assignment
public class Day09A {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String userName = "";
        String passWord = "";
        
        System.out.print("Username: ");
        userName = uInput.nextLine();
        System.out.print("Password: ");
        passWord = uInput.nextLine();
        
        if (userName.equals("admin")) {
            if (passWord.equals("pass1234")) {
                System.out.println("Login Successful!!!");
            } else {
                System.out.println("Incorrect username or password");
            }
        }  else {
            System.out.println("Incorrect username or password");
        }
    }
    
}
