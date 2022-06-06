package Week3;

public class Day13A {
   
    public static void main(String[] args) {
        String txt1 = "Hanlon's Razor";
        String txt2 = "hanlon's razor";
        
        System.out.println(".equals");
        System.out.println(txt1.equals(txt2));
        
        System.out.println("\n.equalsIgnoreCase");
        System.out.println(txt1.equalsIgnoreCase(txt2));
        
        System.out.println("\n.toUpperCase .toLowerCase");
        System.out.println("txt1 to Upper: "+txt1.toUpperCase());
        System.out.println("txt2 to Lower: "+txt2.toLowerCase());
        
        System.out.println("\ncombining toUpperCase and equals");
        System.out.println(txt1.toUpperCase().equals(txt2.toUpperCase()));
        // a long alternative version of .equalsIgnoreCase
        
        System.out.println("\n.compare");
        System.out.println(txt1.compareTo(txt2));
        
    }
}
