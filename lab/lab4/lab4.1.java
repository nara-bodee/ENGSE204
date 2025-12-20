package lab4_1;
import java.util.Scanner;

class Book{
	private String title;
	private String author;
	
	public Book(String title) {
		this.title = title;
		this.author = "Unknown"; 
	}
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("Title:"+title+",Author:"+author);
	}
}
public class lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Mode:(1:Title/2:Title,Author)");
		int mode = input.nextInt();
		input.nextLine();
		Book mybook;
		
		if(mode == 1) {
			System.out.println("Enter Tital");
			String title = input.nextLine();
			mybook = new Book(title);
		} else if(mode ==2){
			System.out.println("Enter Title");
			String title = input.nextLine();
			System.out.println("Enter Author");
            String author = input.nextLine();
            mybook = new Book(title,author);
		} else {
			System.out.println("This Mode Is Not Available");
			return;
		} 
		mybook.displayInfo();
		input.close();
	}

}
