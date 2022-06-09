package Week3;
import java.util.ArrayList;

public class Day16A {
    public static void main(String[] args) {
        ArrayList<String> aList1 = new ArrayList<String>();
        
        aList1.add("First woof");
        aList1.add("Second woof");
        aList1.add(1,"Third woof");
        aList1.add("Seventh woof");
        aList1.add(4,"Fourth woof");
        
        for (String arrayVal : aList1) {
            System.out.println("Value: " + arrayVal);
        }
        System.out.println("=================");
        // case sensitive checking
        System.out.println("Do the array list contains Third woof? "+aList1.contains("Third woof"));
        //get a certain value from index
        System.out.println("index 1 value: "+aList1.get(1));
        // total items in the array list
        System.out.println("Total items: "+aList1.size());
        // change a value on said index
        aList1.set(3, "3rd woof");
        
        System.out.println("=================");
        for (String arrayVal : aList1) {
            System.out.println("Value: " + arrayVal);
        }
        
    }
}
