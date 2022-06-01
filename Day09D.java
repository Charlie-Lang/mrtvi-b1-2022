package Week2;

// what if the sample in Day09C is using an OR logic operator
public class Day09D {
    public static void main(String[] args) {
        String foodName = "singkamas";
        
        if (foodName.equalsIgnoreCase("manga")
                || foodName.equalsIgnoreCase("kamatis")
                || foodName.equalsIgnoreCase("papaya")
                || foodName.equalsIgnoreCase("langka")) {
            System.out.println(foodName + " is a fruit");
        } else  if (foodName.equalsIgnoreCase("singkamas")
                || foodName.equalsIgnoreCase("kamote")) {
            System.out.println(foodName + " is a vegetable");
        } else {
            System.out.println("Not is selection");
        }
    }
    // pag nasa iisang array or column yung hinahanap mo madalas OR yun
    // Kung di pwedeng sabay maganap yung conditions
}