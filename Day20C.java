package Week4;

// using Day20Shapes class
public class Day20C {
    public static void main(String[] args) {
        Circle callCircle = new Circle();
        callCircle.getRadius(3.2);
        callCircle.sPerimeter();
        callCircle.sArea();
    }
}

class Circle implements Day20Shapes {
    double radius = 0;
    
    public void getRadius(double radius){
        this.radius = radius;
    }
    
    public void sPerimeter(){
        double perimeter = 0;
        perimeter = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is "+perimeter);
    }
    
    public void sArea(){
        double area = 0;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is "+area);
    }
}

class Square implements Day20Shapes {
    double side = 0;
    
    public void getSide(double side){
        this.side = side;
    }
    
    public void sPerimeter(){
        double perimeter = 0;
        perimeter = 4*side;
        System.out.println("The perimeter of the square is "+perimeter);
    }
    
    public void sArea(){
        double area = 0;
        area = Math.pow(side, 2);
        System.out.println("The area of the square is "+area);
    }
}