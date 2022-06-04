package Week2;

public class Day12C {
    public static void main(String[] args) {
        String txt1 = "the quick brown fox jumps over the lazy dog";
        String searchWord = "the";
        String endWord = "dog";
        String txt2 = "passWord";
        String txt3 = "Password";
        
        System.out.println("txt contains result: " 
                + txt1.contains(searchWord));
        
        System.out.println("do txt1 ends with dog? "
                + txt1.endsWith(endWord));
        
        System.out.println("comparing txt1 and txt2: "
                + txt2.equalsIgnoreCase(txt3));
    }
}
