package Week2;

// same as 8A sample
public class Day08F {
    public static void main(String[] args) {
        byte age = 18;
        
        switch (age) {
            case 1: case 2: case 3: case 4: case 5: case 6:
            case 7: case 8: case 9: case 10: case 11: case 12:
            case 13: case 14: case 15: case 16:
            case 17:
                System.out.println("You can only watch up to R-13 Movies");
                break;
                // any case from 1 to 17 if triggered
                // will reach and run line 13
            default:
                System.out.println("You can watch any kind of movies");
        }
    }
}
