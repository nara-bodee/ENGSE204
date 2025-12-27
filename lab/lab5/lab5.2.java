package lab5_2;
import java.util.Scanner;

/*
 * Superclass Animal
 * Represents a general animal with basic attributes and behaviors
 */
class Animal {

    // Protected attributes so subclasses can access them directly
    protected String name;
    protected int age;

    /*
     * Default sound behavior
     * This method is intended to be overridden by subclasses
     */
    public void makeSound() {
        System.out.println("I am an animal.");
    }

    /*
     * Display animal information
     */
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/*
 * Subclass Cat
 * Demonstrates method overriding
 */
class Cat extends Animal {

    /*
     * Override makeSound to provide Cat-specific behavior
     */
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

/*
 * Main class
 * Entry point of the program
 */
public class lab5_2 {

    public static void main(String[] args) {

        // Create Scanner for input
        Scanner input = new Scanner(System.in);

        // Receive cat name
        System.out.println("Enter name:");
        String name = input.nextLine();

        // Receive cat age
        System.out.println("Enter age:");
        int age = input.nextInt();

        // Create Cat object
        Cat myCat = new Cat();

        // Assign inherited attributes directly
        myCat.name = name;
        myCat.age = age;

        // Call inherited method
        myCat.displayInfo();

        // Call overridden method
        myCat.makeSound();

        // Close scanner to prevent resource leak
        input.close();
    }
}
