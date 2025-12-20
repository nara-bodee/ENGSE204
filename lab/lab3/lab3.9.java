package lab3_9;
import java.util.Scanner;

class User {

    private String username;
    private String password;

    private static int minPasswordLength = 8;

    public User(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }
}

public class lab3_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter minLength: ");
        int minLength1 = input.nextInt();
        User.setMinLength(minLength1);
        input.nextLine();

        System.out.println("Enter user1 name: ");
        String user1_name = input.nextLine();

        System.out.println("Enter user1 password: ");
        String user1_pass = input.nextLine();
        User user1 = new User(user1_name, user1_pass);

        System.out.println("Enter user2 name: ");
        String user2_name = input.nextLine();

        System.out.println("Enter user2 password: ");
        String user2_pass = input.nextLine();
        User user2 = new User(user2_name, user2_pass);

        System.out.println("Enter minLength: ");
        int minLength2 = input.nextInt();
        input.nextLine();
        User.setMinLength(minLength2);
        
        System.out.println("Enter user2 new password: ");
        String user2_newPass = input.nextLine();
        
        user2.setPassword(user2_newPass);

        System.out.println("Password User1 Is: "+user1.getPassword());
        System.out.println("Password User2 Is:"+user2.getPassword());

        input.close();
    }
}
