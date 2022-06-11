/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mattroseb1d18;

/**
 *
 * @author ahlle
 */
public class Day18A {

    public static void main(String[] args) {
        int num1 = 42%8;
        
        System.out.println("42 % 8 = " + num1);
        
        int num2 = 7;
        System.out.println(++num2);
        System.out.println(num2);
        
        char ch1 = 'M';
        
        if (ch1 == 'M') {
            System.out.println("Mr.");
        } else if (ch1 == 'F') {
            System.out.println("Ms.");
        }
        ch1 = 'F';
        switch (ch1) { 
            case 'M':
                System.out.println("Mr.");
                break;
            case 'F':
                System.out.println("Ms.");
                break;
        }
        String txt1 = "test";
    }
}
