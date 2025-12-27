package lab5_10;

import java.util.Scanner;

/*
 * Superclass ProjectTask
 * Represents a general project task
 */
class ProjectTask {

    protected String description;
    protected int baseHours;

    /*
     * Constructor
     * Initializes task description and base working hours
     */
    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    /*
     * Calculate base cost
     * Rate is 50.0 per hour
     */
    public double calculateCost() {
        return baseHours * 50.0;
    }
}

/*
 * Subclass ComplexTask
 * Represents a complex task with extra setup fee
 */
class ComplexTask extends ProjectTask {

    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    /*
     * Calculate cost with 10% complexity surcharge and setup fee
     */
    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

/*
 * Subclass SimpleTask
 * Represents a simple task with no additional cost
 */
class SimpleTask extends ProjectTask {

    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    /*
     * Calculate cost without extra charge
     */
    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

/*
 * Main class
 * Demonstrates polymorphism using ProjectTask array
 */
public class lab5_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Complex Task Input =====
        System.out.println("Enter complex task description:");
        String complexDesc = input.nextLine();

        System.out.println("Enter base hours:");
        int complexHours = input.nextInt();

        System.out.println("Enter setup fee:");
        double setupFee = input.nextDouble();
        input.nextLine(); // clear buffer

        // ===== Simple Task Input =====
        System.out.println("Enter simple task description:");
        String simpleDesc = input.nextLine();

        System.out.println("Enter base hours:");
        int simpleHours = input.nextInt();

        // Create task objects
        ProjectTask complexTask = new ComplexTask(
                complexDesc, complexHours, setupFee
        );
        ProjectTask simpleTask = new SimpleTask(
                simpleDesc, simpleHours
        );

        // Store tasks in parent-type array (Polymorphism)
        ProjectTask[] tasks = new ProjectTask[2];
        tasks[0] = complexTask;
        tasks[1] = simpleTask;

        // Display calculated cost for each task
        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }

        input.close();
    }
}
