package lab3_1;
import java.util.Scanner;

class User {
	 private String username;
	 
	 public User(String username) {
	        this.username = username;
	 }
	 public String getUsername() {
	        return username;
	 }
}
public class lab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter User Name:");
		 String inputUsername = input.nextLine();
		 
		 User user = new User(inputUsername);
		 System.out.println(user.getUsername());

	}

}
