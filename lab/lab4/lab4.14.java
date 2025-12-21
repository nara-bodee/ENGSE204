package lab4_14;
import java.util.Scanner;

class ScoreBoard {
    private final String gameName;
    private final int[] scores;

    // Shallow Copy constructor
    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores; // Shallow Copy (reference)
    }

    // Copy Constructor (Deep Copy)
    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScores() {
        System.out.println(
            gameName + ": " +
            scores[0] + ", " +
            scores[1] + ", " +
            scores[2]
        );
    }
}

public class lab4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter game name:");
        String gameName = input.nextLine();

        System.out.println("Enter score 1:");
        int s1 = input.nextInt();

        System.out.println("Enter score 2:");
        int s2 = input.nextInt();

        System.out.println("Enter score 3:");
        int s3 = input.nextInt();

        int[] originalScores = { s1, s2, s3 };

        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);
        ScoreBoard sb2 = new ScoreBoard(sb1);

        System.out.println("Enter new score for index 0:");
        int newScore = input.nextInt();
        originalScores[0] = newScore;

        sb1.displayScores();
        sb2.displayScores();

        input.close();
    }
}
