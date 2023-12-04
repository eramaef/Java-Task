// Step 1: Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Create an abstract class called AbstractShape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor to initialize attributes
    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// Step 3: Implement two concrete classes that extend AbstractShape
class Circle extends AbstractShape {
    double radius;

    Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 4: In the Main class
public class Task12 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Blue", 4, 7);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
