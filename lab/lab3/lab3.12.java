package lab3_12;
import java.util.Scanner;

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class lab3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.println("Enter tax rate: ");
        double taxRate = input.nextDouble();

        System.out.println("Enter raise amount: ");
        double raiseAmount = input.nextDouble();

        Employee emp = new Employee(name, monthlySalary);

        System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.println("Tax (After): " + emp.calculateTax(taxRate));
    }
}
