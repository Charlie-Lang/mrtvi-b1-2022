package Week4;

public class Day19E {
    public static void main(String[] args) {
        intro("Jonn Williams");
        System.out.println("------------");
        intro("Peter Full","Valenzuela City");
        System.out.println("------------");
        intro("Casey McGregor","Manila City","Shoutcasting");
        System.out.println("------------");
    }
    
    public static void intro(String name) {
        System.out.println("My name is "+name);
    }
    
    public static void intro(String name, String address) {
        System.out.println("My name is "+name);
        System.out.println("I live at "+address);
    }
    
    public static void intro(String name, String address, String hobbies) {
        System.out.println("My name is "+name);
        System.out.println("I live at "+address);
        System.out.println("And my hobbies are "+hobbies);
    }
}
