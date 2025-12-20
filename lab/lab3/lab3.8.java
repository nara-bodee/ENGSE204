package lab3_8;
import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
    	this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > stock) {
            System.out.println("Not enough stock.");
        } else {
            stock -= amount;
            System.out.println("Sale successful.");
        }
    }
}

public class lab3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Product Name:");
		String productName = input.nextLine();
		System.out.println("Enter Initial Stock:");
        int initialStock = input.nextInt();
        input.nextLine();

        InventoryItem item = new InventoryItem(productName, initialStock);

        System.out.println("N:");
        int N = input.nextInt();
        input.nextLine();
        for (int i = 0; i < N; i++) {
        	System.out.println("Enter Command:");
            String command = input.next();
            System.out.println("Enter Amount:");
            int amount = input.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());
	}

}
