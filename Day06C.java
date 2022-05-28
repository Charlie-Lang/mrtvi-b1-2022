package mattrosejavab1compiled;

// how to set and get the value in an array
public class Day06C {
    public static void main(String[] args) {
        String[] txtArray1 = new String[7];
        int count = 0;
        txtArray1[0] = "red";
        txtArray1[1] = "orange";
        txtArray1[2] = "yellow";
        txtArray1[3] = "green";
        txtArray1[4] = "blue";
        txtArray1[5] = "indigo";
        txtArray1[6] = "violet";
        // this is a better way if the array dont have default values
        
        System.out.println(txtArray1[0] + " combined with " + txtArray1[2]
            + " will be " + txtArray1[1]);
        
        System.out.println("\nThis is the contents of the array:");
        System.out.println(txtArray1[count++]);
        System.out.println(txtArray1[count++]);
        System.out.println(txtArray1[count++]);
        System.out.println(txtArray1[count++]);
        System.out.println(txtArray1[count++]);
        System.out.println(txtArray1[count++]);
        System.out.println(txtArray1[count++]);
    }
}
