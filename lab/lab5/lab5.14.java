package lab5_14;
import java.util.Scanner;

/*
 * Superclass Shipping
 * Represents basic shipping service
 */
class Shipping {

    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    // Base shipping fee
    public double calculateTotalFee() {
        return baseFee;
    }
}

/*
 * Subclass StandardShipping
 */
class StandardShipping extends Shipping {

    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    // Standard shipping includes 5% handling fee
    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

/*
 * Subclass PremiumShipping
 */
class PremiumShipping extends Shipping {

    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    // Premium shipping uses base fee from superclass + insurance fee
    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

/*
 * Main class
 */
public class lab5_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== Input for Standard Shipping =====
        System.out.println("Enter Standard Shipping Tracking ID:");
        String stdId = input.nextLine();

        System.out.println("Enter Standard Shipping Base Fee:");
        double stdBaseFee = input.nextDouble();
        input.nextLine(); // clear buffer

        // ===== Input for Premium Shipping =====
        System.out.println("Enter Premium Shipping Tracking ID:");
        String preId = input.nextLine();

        System.out.println("Enter Premium Shipping Base Fee:");
        double preBaseFee = input.nextDouble();

        System.out.println("Enter Premium Shipping Insurance Fee:");
        double insuranceFee = input.nextDouble();

        // Create shipping objects
        Shipping standard = new StandardShipping(stdId, stdBaseFee);
        Shipping premium = new PremiumShipping(preId, preBaseFee, insuranceFee);

        // Store in Shipping array (Polymorphism)
        Shipping[] shipments = new Shipping[2];
        shipments[0] = standard;
        shipments[1] = premium;

        // Display total fee for each shipping
        System.out.println("Total Shipping Fees:");
        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        input.close();
    }
}
