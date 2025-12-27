package lab5_7;
import java.util.Scanner;

//Superclass
class Employee {

 protected String name;
 protected double baseSalary;

 public Employee(String name, double baseSalary) {
     this.name = name;
     this.baseSalary = baseSalary;
 }

 // Calculate base salary
 public double calculatePay() {
     return baseSalary;
 }
}

//Subclass: SalesEmployee
class SalesEmployee extends Employee {

 protected double commissionRate;

 public SalesEmployee(String name, double baseSalary, double commissionRate) {
     super(name, baseSalary);
     this.commissionRate = commissionRate;
 }

 // Override calculatePay for sales employee
 @Override
 public double calculatePay() {
     return baseSalary + (baseSalary * commissionRate);
 }
}

//Subclass: Manager
class Manager extends Employee {

 protected double fixedBonus;

 public Manager(String name, double baseSalary, double fixedBonus) {
     super(name, baseSalary);
     this.fixedBonus = fixedBonus;
 }

 // Override calculatePay for manager
 @Override
 public double calculatePay() {
     return baseSalary + fixedBonus;
 }
}

//Utility class
class PayrollProcessor {

 public static void process(Employee e) {
     System.out.println(e.name + " total pay: " + e.calculatePay());
 }
}

//Main class
public class lab5_7 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Input for SalesEmployee
     System.out.println("Enter sales employee name:");
     String salesName = sc.nextLine();

     System.out.println("Enter sales employee base salary:");
     double salesSalary = sc.nextDouble();

     System.out.println("Enter commission rate:");
     double commissionRate = sc.nextDouble();
     sc.nextLine(); // clear buffer

     // Input for Manager
     System.out.println("Enter manager name:");
     String managerName = sc.nextLine();

     System.out.println("Enter manager base salary:");
     double managerSalary = sc.nextDouble();

     System.out.println("Enter manager bonus:");
     double fixedBonus = sc.nextDouble();

     // Create objects
     SalesEmployee salesEmployee = new SalesEmployee(
             salesName,
             salesSalary,
             commissionRate
     );

     Manager manager = new Manager(
             managerName,
             managerSalary,
             fixedBonus
     );

     // Process payroll
     PayrollProcessor.process(salesEmployee);
     PayrollProcessor.process(manager);

     sc.close();
 }
}
