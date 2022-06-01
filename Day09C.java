package Week2;

// or logic example fruit or vegetable choice
// eto sya pag gumamit ng switch statement instead of OR logic
public class Day09C {
    public static void main(String[] args) {
        String foodName = "papaya";
        
        switch (foodName) {
            case "manga":
            case "kamatis":
            case "papaya":
            case "langka":
                System.out.println(foodName + " is a fruit");
                break;
            case "singkamas":
            case "kamote":
                System.out.println(foodName + " is a vegetable");
                break;
            default:
                System.out.println("Not is selection");
        }
    }
}
