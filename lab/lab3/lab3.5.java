package lab3_5;
import java.util.Scanner;

class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}
public class lab3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter Server:");
		String connectionString = input.nextLine();

        DatabaseConnection db = new DatabaseConnection(connectionString);

        db.connect();
        db.disconnect();
        db.disconnect(); 

        System.out.println(db.isConnected());
	}

}
