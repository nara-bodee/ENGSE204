package lab4_2;
import java.util.Scanner;

class Product{
	private String name;
	private double price;
	
	public Product(String name) {
		this(name, 0.0);
	}
	public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
	public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
public class lab4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Mode (1.Name/2.Name,Price)");
		int mode = input.nextInt();
		input.nextLine();
		
		Product p;
		
		if (mode == 1) {
			System.out.println("Enter Name:");
			String name = input.nextLine();
			p = new Product(name);
		} else if (mode == 2) {
			System.out.println("Enter Name:");
			String name = input.nextLine();
			System.out.println("Enter Price:");
			double price = input.nextDouble();
			p = new Product(name,price);
		} else {
			System.out.println("This Mode Is Not Available");
			return;
		}
		p.displayInfo();
        input.close();
	}

}
