package lab4_5;
import java.util.Scanner;

class Color {
	private int red;
    private int green;
    private int blue;
    
    public Color(int r, int g, int b) {
        this.red = clamp(r);
        this.green = clamp(g);
        this.blue = clamp(b);
    }
    
    private int clamp(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        }
        return value;
    }
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    
    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}
public class lab4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Red");
		int r = input.nextInt();
		System.out.println("Enter Green");
        int g = input.nextInt();
        System.out.println("Enter Blue");
        int b = input.nextInt();
        
        Color myColor = new Color(r, g, b);
        myColor.displayRGB();
        
        input.close();
	}

}
