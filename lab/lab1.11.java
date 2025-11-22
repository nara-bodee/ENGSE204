package lab_11;

import java.util.Scanner;

public class lab_11 {

    public static int sumArray(int[] numbers) {
        int s = 0;
        for (int i = 0; i < numbers.length; i++) {
            s += numbers[i]; 
        }
        return s;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = input.nextInt();

        int[] Number = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter Number " + i + ": ");
            Number[i] = input.nextInt();
        }

        int r = sumArray(Number);
        System.out.println("Sum = " + r);

        input.close();
    }
}
