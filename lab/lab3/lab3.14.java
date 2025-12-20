package lab3_14;
import java.util.Scanner;

class BankAccount {
    private double balance;

    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class lab3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount myAccount = null;

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command: ");
            String cmd = input.nextLine().trim();

            switch (cmd) {
                case "CREATE":
                    System.out.println("Enter initial deposit: ");
                    double initial = input.nextDouble();
                    input.nextLine();
                    myAccount = new BankAccount(initial);
                    break;

                case "DEPOSIT":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                    } else {
                        System.out.println("Enter amount: ");
                        double dep = input.nextDouble();
                        input.nextLine();
                        myAccount.deposit(dep);
                    }
                    break;

                case "WITHDRAW":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                    } else {
                        System.out.println("Enter amount: ");
                        double w = input.nextDouble();
                        input.nextLine();
                        myAccount.withdraw(w);
                    }
                    break;

                case "STATUS":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                    } else {
                        System.out.println("Balance: " + myAccount.getBalance());
                    }
                    break;

                case "GLOBAL_STATUS":
                    System.out.println("Total Transactions: " +
                        BankAccount.getTotalTransactionCount());
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
