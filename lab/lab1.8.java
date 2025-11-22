package lab1_8;
import java.util.Scanner;
public class lab1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N:");
		int N =input.nextInt();
		int[] array = new int[N];
		
		for (int i=0;i<N;i++) {
			System.out.println("Enter Number"+(i+1));
			array[i] = input.nextInt();
		}
		int max = array[0];
		for (int i = 1;i<N;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println(max);
		input.close();
	}

}

