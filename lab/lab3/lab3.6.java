package lab3_6;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}
public class lab3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter Initial Balance:");
		double initialBalance = input.nextDouble();
		System.out.println("Enter Deposit Amount");
        double depositAmount = input.nextDouble();
        System.out.println("Enter Withdraw Amount");
        double withdrawAmount = input.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);

        System.out.println("Final Balance: " + account.getBalance());
	}

}
