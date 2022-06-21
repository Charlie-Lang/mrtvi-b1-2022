package Week5;

public class Day26A {

    public static void main(String[] args) {
        Object[][] menu = {
            {1, "Spaghetti", 53.0}
            ,{2, "Burger Steak", 65.0}
            ,{3, "French Fries", 55.0}
        };
        
        for (Object[] menuItems : menu) {
            System.out.print(String.format("%3s", menuItems[0])+" | ");
            System.out.print(String.format("%-15s", menuItems[1])+" | ");
            System.out.println(String.format("%3.2s", menuItems[2])+ " |");
        }
    }
    
}
