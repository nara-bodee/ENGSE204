package lab_11;

import java.util.Scanner;

public class lab_11 {

	public static int sumArray (int[] numbers) {
		int sum=0;
		for (int n : numbers) { //สำหรับ (n) แต่ละตัวที่อยู๋ใน (numbers)
			sum += n; 
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N");
		int N = input.nextInt();
		
		int[] array = new int[N];
		
		for (int i = 0;i<N;i++) {
			System.out.println("Enter Number"+(i+1));
			array[i] = input.nextInt();
		}
		int result = sumArray(array);
		
		System.out.println(result);
		
		input.close();
	}

}
