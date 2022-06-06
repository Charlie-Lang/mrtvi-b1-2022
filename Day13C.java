package Week3;


public class Day13C {
    public static void main(String[] args) {
        String txt1 = " Law of  Instruments   ";
        String txt2 = "Some  day  you will be old enough" 
                + " to start reading fairy tales again";
        
        System.out.println("|"+txt1+"|");
        System.out.println("|"+txt1.trim()+"|");
        
        //a combination of loop, indexOf and substring 
        // can remove the extra whitespace between the text
        System.out.println(txt2.indexOf(" "));
        System.out.println(txt2.indexOf(" ",0));
        
        for (int i = 0; i < txt2.length(); i++) {
            System.out.println(txt2.indexOf(" ",i)+" - "+i);
            if (txt2.indexOf(" ",i) > -1) {
                i = txt2.indexOf(" ",i);
            } else {
                i = txt2.length();
            }
        }
    }
}
