package lab4_6;
import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    // --- Public Constructor ---
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;
        return new Point(newX, newY);
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class lab4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter X");
        int x = input.nextInt();
        System.out.println("Enter Y");
        int y = input.nextInt();
        System.out.println("Enter Dx");
        int dx = input.nextInt();
        System.out.println("Enter Dy");
        int dy = input.nextInt();

        Point p1 = new Point(x, y);
        Point p2 = p1.move(dx, dy);
        Point p3 = p2.move(dx, dy);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        input.close();
    }
}

