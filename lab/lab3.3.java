package lab3_3;
import java.util.Scanner;

class User {
	private String password;

	public User(String initialPassword) {
        this.password = initialPassword;
    }
	
	public String getPassword() {
        return password;
    }
	
	public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}
public class lab3_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter Password");
		String initialPassword = input.nextLine();
		System.out.println("Enter New Password");
		String newPassword = input.nextLine();
	 
		User user = new User(initialPassword);
		 
		user.setPassword(newPassword);
		 
		System.out.println("Password IS"+user.getPassword());
	}
}
