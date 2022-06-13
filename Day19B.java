package Week4;

public class Day19B {
    public static void main(String[] args) {
        FordRaptor callFR = new FordRaptor();
        callFR.features();
        callFR.start();
        callFR.run();
        callFR.brakes();
    }
}

class Car {
    public void start() {
        System.out.println("The engine is starting");
    }
    
    public void run() {
        System.out.println("The car is running");
    }
    
    public void steering() {
        System.out.println("Car can steer from left to right");
    }
    
    public void transmission() {
        System.out.println("The car have manual transmission");
    }
    
    public void brakes() {
        System.out.println("The brakes is used. The car is slowing down");
    }
    
    public void features() {
        steering();
        transmission();
    }
}

class FordRaptor extends Car {
    @Override
    public void transmission() {
        System.out.println("A Ford Raptor have a automatic transmission");
    }
    
    @Override
    public void features() {
        super.features(); 
        System.out.println("FordPass™ Connect 4G LTE Wi-Fi Hotspot");
    }
}