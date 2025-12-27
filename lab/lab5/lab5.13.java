package lab5_13;

import java.util.Scanner;

/*
 * Superclass User
 * Represents a general system user
 */
class User {

    protected String name;

    public User(String name) {
        this.name = name;
    }

    // Base clearance level
    public int getClearanceLevel() {
        return 1;
    }
}

/*
 * Subclass Developer
 * Inherits from User
 */
class Developer extends User {

    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    // Developer clearance level
    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

/*
 * Subclass Admin
 * Inherits from Developer
 */
class Admin extends Developer {

    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    // Admin clearance level
    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

/*
 * Main class
 * Controls input, processing, and output
 */
public class lab5_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Input for Developer =====
        System.out.println("Enter Developer name:");
        String devName = input.nextLine();

        System.out.println("Enter number of Developer projects:");
        int devProjects = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== Input for Admin =====
        System.out.println("Enter Admin name:");
        String adminName = input.nextLine();

        System.out.println("Enter number of Admin projects:");
        int adminProjects = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.println("Enter Admin key:");
        String adminKey = input.nextLine();

        // Create objects
        User u1 = new User("Guest");
        Developer d1 = new Developer(devName, devProjects);
        Admin a1 = new Admin(adminName, adminProjects, adminKey);

        // Store all users in User array (Polymorphism)
        User[] personnel = new User[3];
        personnel[0] = u1;
        personnel[1] = d1;
        personnel[2] = a1;

        // Loop 1: Calculate total clearance level
        int totalClearance = 0;
        for (User u : personnel) {
            totalClearance += u.getClearanceLevel();
        }

        // Loop 2: Find Admin and display admin key
        System.out.println("Admin Security Key:");
        for (User u : personnel) {
            if (u instanceof Admin) {
                Admin admin = (Admin) u; // Downcasting
                System.out.println(admin.getAdminKey());
            }
        }

        // Display final result
        System.out.println("Total Clearance Level:");
        System.out.println(totalClearance);

        input.close();
    }
}
