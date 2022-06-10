package Week3;

public class Day17D {
    public static void main(String[] args) {
        Day17D callMe = new Day17D();
        
        String quotes1 = "If  you don't know history, then "
                + "you don't know    anything. You are a leaf "
                + "that doesn't know it is part of a tree. ñ";
        
        String[] quotesDivided = quotes1.split(" ");
        
        System.out.println("og string:");
        System.out.println(quotes1);
        
        
        System.out.println("\nAfter trimming and capitalizing the 1st character per word");
        for (String string : quotesDivided) {
            if (!string.isEmpty()) {
                System.out.print(callMe.caps1stLetter(string) + " ");
            }
        }
        
        System.out.println("");
        System.out.println(callMe.caps1stLetter("halllo"));
    }
    
    public String caps1stLetter(String txtIn) {
        String txtOut = txtIn.trim().substring(0, 1).toUpperCase()
            + txtIn.trim().substring(1, txtIn.trim().length());
        return txtOut;
    }
}
