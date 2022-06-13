package Week4;

public class Day19C{
    public static void main(String[] args) {
        Motorcycle callMotor1 = new Motorcycle();
        Motorcycle callMotor2 = new Motorcycle(45,170,4);
        System.out.println("-----1-----");
        callMotor1.summary();
        System.out.println("-----2-----");
        callMotor2.summary("Honda Click 125i");
        
    }
}

class Motorcycle {
    int maxSpeed;
    int maxLoad;
    int speedShift;
    
    public Motorcycle() {
        maxSpeed = 40;
        maxLoad = 200;
        speedShift = 5;
    }
    
    public Motorcycle(int mSpeed, int mLoad, int shift){
        maxSpeed = mSpeed;
        maxLoad = mLoad;
        speedShift = shift;
    }
    
    public void summary() {
        System.out.println("The Motorcycle have a max speed of "+maxSpeed);
        System.out.println("It can handle a load of "+maxLoad+" kg");
        System.out.println("It have "+speedShift+" speeds");
    }
    
    public void summary(String modelName) {
        System.out.println("The Motorcycle's model is "+modelName);
        System.out.println("The Motorcycle have a max speed of "+maxSpeed);
        System.out.println("It can handle a load of "+maxLoad+" kg");
        System.out.println("It have "+speedShift+" speeds");
    }
}
