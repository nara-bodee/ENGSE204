package lab3_13;
import java.util.Scanner;

class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        }
    }

    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }
    
    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        int available = maxLicenses - usedLicenses;
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + available);
    }
}

public class lab3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command: ");
            String cmd = input.nextLine().trim();

            if (cmd.equals("SET")) {
                System.out.println("Enter new max: ");
                int max = input.nextInt();
                input.nextLine();
                LicenseManager.setMax(max);

            } else if (cmd.equals("CHECKOUT")) {
                LicenseManager.checkOut();

            } else if (cmd.equals("CHECKIN")) {
                LicenseManager.checkIn();

            } else if (cmd.equals("STATUS")) {
                LicenseManager.displayStatus();

            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}

