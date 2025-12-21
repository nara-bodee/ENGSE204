package lab4_13;
import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        if (durationDays > maxDuration) {
            durationDays = maxDuration;
        }
        if (durationDays < 0) {
            durationDays = 0;
        }
        this.planName = planName;
        this.durationDays = durationDays;
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;

        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class lab4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter max duration:");
        int max = input.nextInt();
        input.nextLine();
        Subscription.setMaxDuration(max);

        System.out.println("Enter plan name:");
        String planName = input.nextLine();

        System.out.println("Enter initial days:");
        int days = input.nextInt();

        Subscription sub = new Subscription(planName, days);

        System.out.println("Enter extension days (1):");
        int extend1 = input.nextInt();
        sub = sub.extend(extend1);

        System.out.println("Enter extension days (2):");
        int extend2 = input.nextInt();
        sub = sub.extend(extend2);

        sub.displayInfo();
        input.close();
    }
}
