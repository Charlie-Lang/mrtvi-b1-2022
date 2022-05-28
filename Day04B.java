
package mattrosejavab1compiled;
// using static data types
// what will happen when you the datatype is outside the method
public class Day04B {
    static float fNum1 = 42.27f;
    double dNum1 = 98.12;
    
    public static void main(String[] args) {
        System.out.print("Calling float number: ");
        System.out.println(fNum1);
        Day04B callMe = new Day04B(); //creating an instance of itself
        // Day04B is the name of the class this will be change in accordance 
        // to your class name
        System.out.print("Calling double number: ");
        System.out.println(callMe.dNum1);
        // TODO code application logic here
        System.out.println("------");
        System.out.println(fNum1 + callMe.dNum1);
    }
}
