package lab3_2;
import java.util.Scanner;

class Player {
	private int score;
	
	public Player(int initialScore) {
        this.score = initialScore;
    }
	
	public int getScore() {
        return score;
    }
	
	public void setScore(int newScore) {
        this.score = newScore;
    }
}
public class lab3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Enter Score");
		int initialScore = input.nextInt();
		System.out.println("Enter New Score");
		int updatedScore = input.nextInt();
		 
		Player player = new Player(initialScore);
		 		 
		player.setScore(updatedScore);
		System.out.println("Score");
		System.out.println(player.getScore());
	}

}
