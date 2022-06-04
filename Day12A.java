package Week2;

public class Day12A {

    public static void main(String[] args) {
        String txt1 = "Matt Rose";
        int count = 0;
        
        char[] chArr = txt1.toCharArray();
        for (char c : chArr) {
            System.out.println(c);
        }
        
        System.out.println("-----------");
        for (char c : chArr) {
            for (int i = 0; i < count; i++) {
                System.out.print(" ");
            }
            System.out.println(c);
            count++;
        }
        
        System.out.println("-----------");
        System.out.println("7th index: "+txt1.charAt(7));
    }    
}
