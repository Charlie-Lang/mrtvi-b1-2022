package Week3;

// combining Day13D and Day14A files
// The effect will capitalize the first letter of each word
public class Day17C { 
    public static void main(String[] args) {
        String quotes1 = "If  you don't know history, then "
                + "you don't know    anything. You are a leaf "
                + "that doesn't know it is part of a tree. ñ";
        
        String[] quotesDivided = quotes1.split(" ");
        
        System.out.println("og string:");
        System.out.println(quotes1);
        
        
        System.out.println("\nAfter trimming and capitalizing the 1st character per word");
        for (String string : quotesDivided) {
            if (!string.isEmpty()) {
                System.out.print(string.trim().substring(0, 1).toUpperCase()
                        + string.trim().substring(1, string.trim().length())
                        + " ");
            }
        }
    }
}
