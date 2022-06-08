package Week3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Day15D {
    public static void main(String[] args) {
        double num1 = 12.53;
        int num2 = 0;
        num2 = (int) num1; //type casting
        
        System.out.println(num2);
        System.out.println(Math.round(num1));
        System.out.println(Math.rint(num1));
        
        System.out.println("-------------");
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println("-------------");
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*5);
        System.out.println("-------------");
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
        System.out.println(Math.round(Math.random()*5+1));
    }
}
