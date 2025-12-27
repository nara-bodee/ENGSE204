package lab5_8;

import java.util.Scanner;

/*
 * Superclass Person
 * Acts as a common parent for all person types
 */
class Person {

    protected String name;

    /*
     * Constructor
     * Initializes person's name
     */
    public Person(String name) {
        this.name = name;
    }

    /*
     * Returns basic status information
     */
    public String getStatus() {
        return "Person: " + name;
    }
}

/*
 * Subclass Student
 * Represents a student person
 */
class Student extends Person {

    protected int studentId;

    /*
     * Constructor
     * Uses super() to initialize inherited name
     */
    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    /*
     * Override getStatus() for student-specific output
     */
    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

/*
 * Subclass Employee
 * Represents an employee person
 */
class Employee extends Person {

    protected double salary;

    /*
     * Constructor
     * Uses super() to initialize inherited name
     */
    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    /*
     * Applies bonus to employee salary
     */
    public void applyBonus(double bonus) {
        this.salary = this.salary + bonus;
    }

    /*
     * Override getStatus() for employee-specific output
     */
    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

/*
 * Main class
 * Demonstrates instanceof and downcasting
 */
public class lab5_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Student Input =====
        System.out.println("Enter student name:");
        String studentName = input.nextLine();

        System.out.println("Enter student ID:");
        int studentId = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== Employee Input =====
        System.out.println("Enter employee name:");
        String employeeName = input.nextLine();

        System.out.println("Enter employee salary:");
        double salary = input.nextDouble();

        // Create objects
        Person student = new Student(studentName, studentId);
        Person employee = new Employee(employeeName, salary);

        // Store objects in parent-type array (Polymorphism)
        Person[] people = new Person[2];
        people[0] = student;
        people[1] = employee;

        // Loop 1: instanceof check and downcasting
        for (Person person : people) {

            /*
             * instanceof ensures safe downcasting
             * Only Employee objects receive bonus
             */
            if (person instanceof Employee) {
                Employee emp = (Employee) person;
                emp.applyBonus(1000.0);
            }
        }

        // Output section
        System.out.println("=== Person Status After Bonus Calculation ===");

        // Loop 2: Display final status
        for (Person person : people) {
            System.out.println(person.getStatus());
        }

        input.close();
    }
}
