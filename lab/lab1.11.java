package lab_11;

import java.util.Scanner;

public class lab_11 {

	public static int sumArray (int[] numbers) {
		int s = 0;
		for (int n : numbers) {
			s += n; 
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N");
		int N = input.nextInt();
		
		int[] Number = new int[N];
		
		for (int i = 0;i<N;i++) {
			System.out.println("Enter Number"+(i+1));
			Number[i] = input.nextInt();
		}
		int r = sumArray(Number);
		
		System.out.println(r);
		
		input.close();
	}

}
