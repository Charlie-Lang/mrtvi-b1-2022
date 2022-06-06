package Week3;

// a trim if you want to remove the extra spaces in between the text
public class Day13D {
    public static void main(String[] args) {
        String quotes1 = "If  you don't know history, then "
                + "you don't know    anything. You are a leaf "
                + "that doesn't know it is part of a tree.";
        
        String[] quotesDivided = quotes1.split(" ");
        
        System.out.println("og string:");
        System.out.println(quotes1);
        
        for (String string : quotesDivided) {
            if (!string.isEmpty()) {
                System.out.print(string + " ");
            }
        }
    }
}
