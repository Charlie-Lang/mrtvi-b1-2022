package Week3;

public class Day13E {
    public static void main(String[] args) {
        String txt1 = "Cemetery";
        String midName = " crisostomo ";
        
        System.out.println(txt1);
        System.out.println("substring 4: " + txt1.substring(4));
        System.out.println("substring 4 5: " + txt1.substring(4,5));
        
        System.out.println("Middle name sample: "+midName);
        System.out.println("Middle initial: "+ midName.trim().substring(0, 1).toUpperCase());
    }
}
