package lab5_12;

import java.util.Scanner;

/*
 * Superclass Service
 * Represents a generic service
 */
class Service {

    protected String name;
    protected double basePrice;

    /*
     * Constructor
     * Initializes service name and base price
     */
    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    /*
     * Calculate final price (default)
     */
    public double calculateFinalPrice() {
        return basePrice;
    }
}

/*
 * Subclass BasicService
 * Adds 5% tax to base price
 */
class BasicService extends Service {

    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

/*
 * Subclass PremiumService
 * Adds premium rate to base price
 */
class PremiumService extends Service {

    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

/*
 * Main class
 * Demonstrates super constructor and method overriding
 */
public class lab5_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Input for BasicService =====
        System.out.println("Enter basic service name:");
        String basicName = input.nextLine();

        System.out.println("Enter base price:");
        double basicPrice = input.nextDouble();
        input.nextLine(); // clear buffer

        // ===== Input for PremiumService =====
        System.out.println("Enter premium service name:");
        String premiumName = input.nextLine();

        System.out.println("Enter base price:");
        double premiumPrice = input.nextDouble();

        System.out.println("Enter premium rate:");
        double premiumRate = input.nextDouble();

        // Create service objects
        Service basicService = new BasicService(basicName, basicPrice);
        Service premiumService = new PremiumService(
                premiumName, premiumPrice, premiumRate
        );

        // Store services in parent-type array (Polymorphism)
        Service[] services = new Service[2];
        services[0] = basicService;
        services[1] = premiumService;

        // Calculate and display final prices
        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        input.close();
    }
}
