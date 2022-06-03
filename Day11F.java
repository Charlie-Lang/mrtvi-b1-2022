package Week2;

public class Day11F {
    public static void main(String[] args) {
        String[][] txtArray3 = {
            {"A","B"}
            ,{"C","D","E"}
            ,{"F","G"}
        };
        System.out.println("Array rows: "+txtArray3.length);
        System.out.println("Columns per row:");
        for (int i = 0; i < txtArray3.length; i++) {
            System.out.println("Row "+i+": "+txtArray3[i].length);
        }
        System.out.println("Getting the values of the array:");
        for (int i = 0; i < txtArray3.length; i++) {
            for (int j = 0; j < txtArray3[i].length; j++) {
                System.out.print("|"+txtArray3[i][j]);
            }
            System.out.println("|");
        }
    }
}
