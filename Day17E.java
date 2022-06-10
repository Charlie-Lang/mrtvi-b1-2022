package Week3;

public class Day17E {
    private String empName = "Lagombi"; 
    public static String txt1 = "The golden goose";
    
    
    public static void main(String[] args) {
        Day17E callMe = new Day17E();
        Day17E callMe2 = new Day17E();
        
        callMe2.empName = "Barroth";
        callMe.sayName();
        callMe.makeNoise();
        System.out.println("");
       
        callMe2.sayName();
        callMe2.makeNoise();
        
        txt1 = "The Wolf in Sheep's Clothing";
        
        callMe.makeNoise();
        callMe2.makeNoise();
    }
   
    private void sayName() { 
        System.out.println(empName);     // private access is ok 
    }
    
    private void makeNoise() { 
        sayName();                    // private access is ok 
        System.out.println(txt1);
    } 
}
