package Week2;

public class Day12D {
    public static void main(String args[]){  
        String name="sonoo";
        String txt1 = "the quick brown fox jumps over the lazy dog";
        
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        
        System.out.println("------------------");
        System.out.println(txt1.indexOf("the"));
        System.out.println(txt1.indexOf("the",1));
        System.out.println(txt1.indexOf("the",32));
        System.out.println("where are all the spaces?");
        for (int i = 0; i < txt1.length(); i++) {
            System.out.println(txt1.indexOf(" ",i));
            if (txt1.indexOf(" ",i) >= 0) {
                i = txt1.indexOf(" ",i) + 1;
            } // kasi nag i infinite loop sya
            
        }
        
    }
}
