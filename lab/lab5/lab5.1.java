package lab5_1;
import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class lab5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = input.nextLine();

        System.out.println("Enter age:");
        int age = input.nextInt();

        Dog myDog = new Dog();
        myDog.name = name;
        myDog.age = age;

        myDog.makeSound();
        myDog.displayInfo();

        input.close();
    }
}
