package lab2_7;
import java.util.Scanner;

class BankAccount {
	private String ownerName;
    private double balance;
    
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
}
    public void withdraw(double amount) {
    	if (this.balance >= amount) {
    		this.balance -= amount;
    		System.out.println("Withdrawal successful.");
        } else {
        	System.out.println("Withdrawal Insufficient funds.");
        }
    }
    	public void displayBalance() {
    		System.out.println("Balance: " + this.balance);
    	}
    }

public class lab2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Owner Name: ");
		String inputOwnerName = input.nextLine();
		System.out.println("Enter Initial Balance: ");
		double inputInitialBalance = input.nextDouble();
		System.out.println("Enter 1st Withdrawal Amount: ");
		double inputWithdrawal1 = input.nextDouble();
		System.out.println("Enter 2st Withdrawal Amount: ");
		double inputWithdrawal2 = input.nextDouble();
		
		BankAccount account = new BankAccount(inputOwnerName, inputInitialBalance);
		account.withdraw(inputWithdrawal1);
		account.withdraw(inputWithdrawal2);
		
		account.displayBalance();
		input.close();
	}

}
