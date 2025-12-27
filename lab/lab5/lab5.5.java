package lab5_5;
import java.util.Scanner;

/*
 * Superclass Shape
 * Acts as a common type for all shapes (Polymorphism)
 */
class Shape {

    // Name of the shape (for identification)
    protected String name;

    /*
     * Constructor
     * Ensures every shape has a name
     */
    public Shape(String name) {
        this.name = name;
    }

    /*
     * Default implementation
     * Subclasses will override this method
     */
    public double calculateArea() {
        return 0.0;
    }
}

/*
 * Subclass Circle
 * Overrides calculateArea() for circle-specific logic
 */
class Circle extends Shape {

    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // Area of a circle = πr²
        return 3.14159 * radius * radius;
    }
}

/*
 * Subclass Rectangle
 * Overrides calculateArea() for rectangle-specific logic
 */
class Rectangle extends Shape {

    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // Area of a rectangle = width * height
        return width * height;
    }
}

/*
 * Main class
 * Demonstrates polymorphism using Shape references
 */
public class lab5_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Receive input for Circle
        System.out.println("Enter circle radius:");
        double radius = input.nextDouble();

        // Receive input for Rectangle
        System.out.println("Enter rectangle width:");
        double width = input.nextDouble();

        System.out.println("Enter rectangle height:");
        double height = input.nextDouble();

        // Polymorphism: parent reference holding child objects
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Circle", radius);
        shapes[1] = new Rectangle("Rectangle", width, height);

        // Loop through shapes and calculate area dynamically
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }

        input.close();
    }
}

