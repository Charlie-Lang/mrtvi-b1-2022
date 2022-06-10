package Week3;

public class Day17F {
    public static void main(String[] args) {
        Animal callAnimal = new Animal();
        Cow callCow = new Cow();
        callAnimal.makeSound();
        callAnimal.eating();
        
        callCow.makeSound();
        callCow.eating();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal is making a sound");
        action();
    }
    
    public void eating() {
        System.out.println("The animal is eating");
    }
    
    private void action() {
        System.out.println("The animal is doing something");
    } // only usable inside the Animal class
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow says MOOO!!!");
    }
}