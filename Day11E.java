package Week2;

public class Day11E {
    public static void main(String[] args) {
        String[][] txtArray2 = new String[2][3];
        txtArray2[0][0] = "row1col1";
        txtArray2[0][1] = "row1col2";
        txtArray2[0][2] = "row1col3";
        txtArray2[1][0] = "row2col1";
        txtArray2[1][1] = "row2col2";
        txtArray2[1][2] = "row2col3";
        
        System.out.println("Total rows: "+txtArray2.length);
        System.out.println("Total cells in row 1: "+txtArray2[0].length);
        
        //option 1
        for (String[] getRow : txtArray2) {
            System.out.println(getRow[0]+"|"+getRow[1]+"|"+getRow[2]);
        }
        System.out.println("--------------");
        
        //option 2 multiple for each loops
        for (String[] getRow : txtArray2) {
            for (String getTxt : getRow) {
                System.out.print(getTxt+"|");
            }
            System.out.println("");
        }
    }
}
