package lab5_4;
import java.util.Scanner;

/*
 * Superclass Vehicle
 * Holds shared attributes for all vehicles
 */
class Vehicle {

    // Protected so subclasses can access directly
    protected String color;

    /*
     * Constructor
     * Using constructor ensures color is always initialized
     */
    public Vehicle(String color) {
        this.color = color;
    }
}

/*
 * Subclass Car
 * Extends Vehicle and adds specific attributes
 */
class Car extends Vehicle {

    // Number of wheels is specific to Car
    protected int wheels;

    /*
     * Constructor
     * super(color) is required to initialize inherited attribute
     */
    public Car(String color, int wheels) {
        super(color);          // Initialize parent attribute
        this.wheels = wheels;  // Initialize own attribute
    }

    /*
     * Display details of the car
     * Uses both inherited and local attributes
     */
    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

/*
 * Main class
 * Entry point of the program
 */
public class lab5_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for color
        System.out.println("Enter color:");
        String color = input.nextLine();

        // Prompt user for number of wheels
        System.out.println("Enter number of wheels:");
        int wheels = input.nextInt();

        // Create Car object using constructor with super()
        Car myCar = new Car(color, wheels);

        // Display car details
        myCar.displayDetails();

        input.close();
    }
}
