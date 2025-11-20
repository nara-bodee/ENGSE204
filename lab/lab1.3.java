package lab1_1;
import java.util.Scanner;
public class lab1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("input number1: ");
		int number1 = input.nextInt();
		
		System.out.println("input number2: ");
		int number2 = input.nextInt();
		input.close();
		int sum;
		sum = number1 + number2;
		
		System.out.println("sum = " + sum);
	}	
}
