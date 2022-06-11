package mattroseb1d18;

public class Day18D extends Day18B{
    public static void main(String[] args) {
        Day18D callMe = new Day18D();
        Day18B callParent = new Day18B();
        String quote1 = "Courage is found in unlikely places.";
        String quote2 = "Life will find a way.";
        
        callMe.testing();
        System.out.println(callMe.titleCaseSentence(quote1));
        System.out.println(callParent.titleCaseSentence(quote2));
        
    }
    
    public void testing() {
        String txt1 = "I will not say: do not weep; "
                + "for not all tears are an evil.";
        
        System.out.println(titleCaseSentence(txt1));
    }
}
