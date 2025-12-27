package lab5_9;
import java.util.Scanner;

/*
 * Superclass Item
 * Used as a parent class for all inventory items
 */
class Item {

    protected String name;

    /*
     * Constructor
     * Initializes item name
     */
    public Item(String name) {
        this.name = name;
    }

    /*
     * Default getValue method
     * Will be overridden by subclasses
     */
    public double getValue() {
        return 0.0;
    }
}

/*
 * Subclass PhysicalProduct
 * Represents tangible products
 */
class PhysicalProduct extends Item {

    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    /*
     * Calculate total value of physical product
     */
    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

/*
 * Subclass DigitalSubscription
 * Represents digital subscription services
 */
class DigitalSubscription extends Item {

    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    /*
     * Calculate total value of subscription
     */
    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

/*
 * Main class
 * Demonstrates polymorphism using Item array
 */
public class lab5_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Physical Product Input =====
        System.out.println("Enter physical product name:");
        String physicalName = input.nextLine();

        System.out.println("Enter unit price:");
        double unitPrice = input.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = input.nextInt();
        input.nextLine(); // clear buffer

        // ===== Digital Subscription Input =====
        System.out.println("Enter digital subscription name:");
        String digitalName = input.nextLine();

        System.out.println("Enter monthly cost:");
        double monthlyCost = input.nextDouble();

        System.out.println("Enter number of months:");
        int months = input.nextInt();

        // Create item objects
        Item physicalProduct = new PhysicalProduct(
                physicalName, unitPrice, quantity
        );
        Item digitalSubscription = new DigitalSubscription(
                digitalName, monthlyCost, months
        );

        // Store items in parent-type array (Polymorphism)
        Item[] inventory = new Item[2];
        inventory[0] = physicalProduct;
        inventory[1] = digitalSubscription;

        // Calculate total value
        double totalValue = 0.0;

        for (Item item : inventory) {
            totalValue += item.getValue();
        }

        // Display final result
        System.out.println("=== Total Inventory Value ===");
        System.out.println(totalValue);

        input.close();
    }
}

