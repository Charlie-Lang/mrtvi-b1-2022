package Week4;

public class Day19A {

    public static void main(String[] args) {
        String txt1 = "The_Great_Pretender";
        String txt2 = "\"May\",  0.1,  0,  0, 1, 1, 0, 0, 0, 2, 0,  0,  0 ";
        
        System.out.println(txt1);
        System.out.println("charAt: "+txt1.charAt(2));
        System.out.println("indexOf: "+txt1.indexOf("e"));
        System.out.println("indexOf e,7: "+txt1.indexOf("e",7));
        System.out.println("substring 3,9: "+txt1.substring(3, 9));
        System.out.println("substring 3, index e,7: "
                +txt1.substring(3, txt1.indexOf("e",7)));
        
        System.out.println("---------");
        System.out.println(txt2);
        
        String[] txtArray = txt2.split(", ");
        for (String string : txtArray) {
            System.out.println("|"+string+"|");
        }
    }
    
}
