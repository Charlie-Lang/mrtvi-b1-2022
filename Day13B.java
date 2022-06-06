package Week3;

// Eto yung idea nung sort ng array
public class Day13B {
    public static void main(String[] args) {
        String[] txtArray1 = {"Kambing","Pato","Baboy","Manok"};
        String[] txtResult = new String[4];
        int[] arrayOrder = new int[4];
        int maxVal = 0;
        
        for (int i = 0; i < txtArray1.length; i++) {
            arrayOrder[i] = txtArray1[0].compareTo(txtArray1[i]);
            System.out.println(arrayOrder[i]);
        } // kinukuha kung nauna ba sya or nahuli dun sa unang value ng array as reference
        
        for (int compVal : arrayOrder) {
            // we will return to this after the math class
        }
        
    }
}
