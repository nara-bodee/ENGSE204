package lab1_2;
import java.util.Scanner;
public class lab1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input Width: ");
		double Width = input.nextDouble();
		System.out.println("input Height:");
		double Height = input.nextDouble();
		double Area;
		Area = Width * Height;
		System.out.println("Area = " + Area);
	}
	
}
