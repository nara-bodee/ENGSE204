package lab5_15;
import java.util.Scanner;

/*
 * Superclass RentalVehicle
 * Represents a rental vehicle with base rental rate
 */
class RentalVehicle {

    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    // Base rental fee
    public double calculateFee() {
        return rentalRate;
    }
}

/*
 * Subclass Car
 * Adds insurance cost to rental fee
 */
class Car extends RentalVehicle {

    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

/*
 * Subclass Motorcycle
 * Adds 10% operation fee to rental fee
 */
class Motorcycle extends RentalVehicle {

    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

/*
 * Main class
 * Controls program flow and user input
 */
public class lab5_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Input for Car =====
        System.out.println("Enter car model:");
        String carModel = input.nextLine();

        System.out.println("Enter car rental rate:");
        double carRate = input.nextDouble();
        input.nextLine(); // clear buffer

        // ===== Input for Motorcycle =====
        System.out.println("Enter motorcycle model:");
        String bikeModel = input.nextLine();

        System.out.println("Enter motorcycle rental rate:");
        double bikeRate = input.nextDouble();

        // Create rental vehicle objects
        RentalVehicle car = new Car(carModel, carRate);
        RentalVehicle motorcycle = new Motorcycle(bikeModel, bikeRate);

        // Store objects in parent class array (Polymorphism)
        RentalVehicle[] vehicles = new RentalVehicle[2];
        vehicles[0] = car;
        vehicles[1] = motorcycle;

        // Calculate total rental fee
        double totalFee = 0.0;
        for (RentalVehicle v : vehicles) {
            totalFee += v.calculateFee();
        }

        // Display result
        System.out.println("Total Rental Fee: " + totalFee);

        input.close();
    }
}
