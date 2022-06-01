package Week2;
import java.util.Scanner;
/**
 *
 * @author ahlle
 */
public class Day09B {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String userName = "";
        String passWord = "";
        
        System.out.print("Username: ");
        userName = uInput.nextLine();
        System.out.print("Password: ");
        passWord = uInput.nextLine();
        
        if (userName.equals("admin") && passWord.equals("pass1234")) {
                System.out.println("Login Successful!!!");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
}
