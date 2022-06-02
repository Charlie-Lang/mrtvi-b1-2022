package Week2;

public class Day10D {
    public static void main(String[] args) {
        String[] txtArray2 = new String[5];
        
        txtArray2[0] = "dog";
        txtArray2[1] = "cat";
        txtArray2[2] = "fish";
        txtArray2[3] = "bird";
        txtArray2[4] = "turtle";
        
        // show the contents of an array from the last to the first
        
        for (int i = (txtArray2.length - 1); i >= 0; i--) {
            System.out.println(txtArray2[i]);
        }
    }
}
