package Week2;

// use the scenario in switch example to if
// 8D and 8E have the same function/effect
public class Day08E {
    public static void main(String[] args) {
        String samgyup = "shrimp"; // beef pork shrimp
        
        if (samgyup.equals("beef")) {
            System.out.println("beef stew");
        } else if (samgyup.equals("pork")) {
            System.out.println("pork tocino");
        } else if (samgyup.equals("shrimp")) {
            System.out.println("shrimp ball");
        } else {
            System.out.println("Not in selection");
        }
    }
}
