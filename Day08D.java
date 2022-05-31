package Week2;

public class Day08D {
    public static void main(String[] args) {
        String samgyup = "pork"; // beef pork shrimp
        
        switch (samgyup) {
            case "beef":
                System.out.println("beef tapa");
                break;
            case "pork":
                System.out.println("pork chop");
                break;
            case "shrimp":
                System.out.println("simpleng hipon");
                break;
            default:
                System.out.println("Not in selection");
        }
    }
}
