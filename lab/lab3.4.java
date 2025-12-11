package lab3_4;
import java.util.Scanner;

class Product {
	private String name;
	
	private static int productCount = 0;
	
	public Product(String name) {
        this.name = name;
        productCount++;
    }
	 public String getName() {
	        return name;
	 }
	 public static int getProductCount() {
	        return productCount;
	 }
}
public class lab3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter N");
		int N = input.nextInt();
		input.nextLine();
		for (int i = 0; i < N; i++) {
			System.out.println("Enter Product:"+(i+1));
            String productName = input.nextLine();
            new Product(productName);
        }
		
		System.out.println("Product Count:"+Product.getProductCount());
	}

}
