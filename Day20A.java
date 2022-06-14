package Week4;

public class Day20A {

    Day20A() { 
        System.out.print("1 "); 
    }
    Day20A(int num) { 
       System.out.print("2 "); 
    } 
    Day20A(Integer num) { 
        System.out.print("3 "); 
    } 
    Day20A(Object num) { 
        System.out.print("4 "); 
    } 
    Day20A(int... nums) { 
        System.out.print("5 "); 
    }
    Day20A(long nums) { 
        System.out.print("6 "); 
    }
       
    public static void main(String[] args) {
        new Day20A(1);
        new Day20A(1L);
    }
    
}
