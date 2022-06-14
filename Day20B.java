package Week4;

public class Day20B{
    public static void main(String[] args) {
        Cow callMoo = new Cow();
        callMoo.intro();
        callMoo.eat();
        callMoo.run();
        callMoo.sleep();
    }
}

abstract class Animals {
    public void sleep() {
        System.out.println("The animal is sleeping");
    }
    
    public void run(){
        System.out.print("The animal is running");
    }
    abstract void intro();
    abstract void eat();
}

class Cow extends Animals {

    @Override
    void intro() {
        System.out.println("A cow is a farm animal");
    }
    
    @Override
    public void eat(){
        System.out.println("The Cow is a Herbivore");
    }
    
    @Override
    public void run() {
        super.run();
        System.out.println(" on 4 legs");
    }
}