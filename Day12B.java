package Week2;

public class Day12B {
    public static void main(String[] args) {
        String txt1 = "Big blue";
        String txt2 = "Whale";
        String txt3 = "On the Ocean";
        int num1 = 72;
        
        System.out.println(txt1);
        
        txt1 = txt1.concat("salitaan");
        System.out.println(txt1);
        txt1 = txt1.concat(" na mahaba");
        System.out.println(txt1);
        
        System.out.println("--------");
        txt1 = "Hello";
        txt1 = txt1.concat(txt2).concat(txt3);
        System.out.println(txt1);
        
        System.out.println("--------");
        txt1 = "Hello2 ";
//        txt1 = txt1.concat(num1).concat(txt3);
        txt1 = txt1 + num1 + txt3;
        System.out.println(txt1);
        //mamaya mapagkamalan mong number sya
    }
}
