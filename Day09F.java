package Week2;

// showing difference between do and while loop
public class Day09F {
    public static void main(String[] args) {
        int i = 10;
        
        while (i < 10) {            
            System.out.println("Im in the while loop - " + i);
            i++;
        }
        
        i = 10;
        do {
            i++;
            System.out.println("Inside the do loop - " + i);
        } while (i < 10);
        // do will run the code inside it at least once even
        // if the condition is already false to begin with
    }
}
