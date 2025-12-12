package lab3_15;
import java.util.Scanner;

class User {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public String getUsername() { 
        return username; 
    }

    public boolean isLocked() { 
        return isLocked; 
    }

    public int getFailedAttempts() { 
        return failedAttempts; 
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            return;
        }

        failedAttempts++;

        if (failedAttempts >= maxAttempts) {
            isLocked = true;
            System.out.println("Login failed. Account locked.");
        } else {
            int attemptsLeft = maxAttempts - failedAttempts;
            System.out.println("Login failed. " + attemptsLeft + " attempts left.");
        }
    }
}

public class lab3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.nextLine();

        User myUser = new User(username);

        System.out.println("Enter number of commands: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Enter command: ");
            String command = input.nextLine();

            if (command.equals("SET_POLICY")) {
                System.out.println("Enter new max attempts: ");
                int max = input.nextInt();
                input.nextLine();
                User.setPolicy(max);
            }
            else if (command.equals("LOGIN")) {
                System.out.println("Enter password: ");
                String pw = input.nextLine();
                myUser.login(pw);
            }
        }

        input.close();
    }
}
