package lab5_3;
import java.util.Scanner;

/*
 * Superclass Employee
 * Represents a general employee with a basic bonus calculation
 */
class Employee {

    // Protected attribute so subclasses can access it
    protected double salary;

    /*
     * Calculate basic bonus (10% of salary)
     */
    public double calculateBonus() {
        return salary * 0.10;
    }
}

/*
 * Subclass Manager
 * Overrides bonus calculation to include extra manager bonus
 */
class Manager extends Employee {

    /*
     * Calculate manager bonus
     * Uses super.calculateBonus() and adds extra 5% of salary
     */
    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus();
        double extraBonus = salary * 0.05;

        return baseBonus + extraBonus;
    }
}

/*
 * Main class
 * Entry point of the program
 */
public class lab5_3 {

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner input = new Scanner(System.in);

        // Receive salary
        System.out.println("Enter salary:");
        double salary = input.nextDouble();

        // Create Manager object
        Manager myManager = new Manager();

        // Assign inherited salary attribute
        myManager.salary = salary;

        // Calculate and display bonus
        System.out.println("Bonus");
        System.out.println(myManager.calculateBonus());

        // Close scanner
        input.close();
    }
}

