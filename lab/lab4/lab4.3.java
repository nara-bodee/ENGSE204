package lab4_3;
import java.util.Scanner;

class Player{
	private String username;
    private int level;
    
    public Player() {
        this.username = "Guest";
        this.level = 1;
    }
    
    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }
    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}
public class lab4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Mode (1.Name/2.Name,Level)");
		int mode = input.nextInt();
		input.nextLine();

		Player p;
		
		if(mode == 1) {
			p = new Player();
		} else if (mode == 2) {
			System.out.println("Enter Name");
			String username = input.nextLine();
			System.out.println("Enter Level");
			int level = input.nextInt();
			p = new Player(username, level);
		} else {
			System.out.println("This Mode Is Not Available");
			return;
		}
		
		 p.displayProfile();
	     input.close();
	}

}
