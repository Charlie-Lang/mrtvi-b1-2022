package Week2;

public class Day11G {
    public static void main(String[] args) {
        String[][][] txtArray4 = new String[3][2][2];
        txtArray4[0][0][0] = "r1m1c1";
        txtArray4[0][0][1] = "r1m1c2";
        txtArray4[0][1][0] = "r1m2c1";
        txtArray4[0][1][1] = "r1m2c1";
        txtArray4[1][0][0] = "r2m1c1";
        txtArray4[1][0][1] = "r2m1c2";
        txtArray4[1][1][0] = "r2m2c1";
        txtArray4[1][1][1] = "r2m2c1";
        txtArray4[2][0][0] = "r3m1c1";
        txtArray4[2][0][1] = "r3m1c2";
        txtArray4[2][1][0] = "r3m2c1";
        txtArray4[2][1][1] = "r3m2c1";
        
        for (String[][] stringses : txtArray4) {
            for (String[] stringse : stringses) {
                for (String string : stringse) {
                    System.out.print(string+"|");
                }
            }
            System.out.println("");
        }
        System.out.println("Getting one of the 2 middle group column");
        
        for (int i = 0; i < txtArray4.length; i++) {
            for (int j = 0; j < txtArray4[i][0].length; j++) {
                System.out.print(txtArray4[i][0][j]+"|");
            }
            System.out.println("");
        }
    }
}
