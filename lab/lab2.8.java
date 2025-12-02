package lab2_8;
import java.util.Scanner;

class TempConverter{
	public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}

public class lab2_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Mode ( C_TO_F or F_TO_C ):");
		String mode = input.nextLine();
		System.out.println("Enter Temperature:");
        double temperature = input.nextDouble();
        
        double result = 0.0;
        if (mode.equals("C_TO_F")) {
        	result = TempConverter.celsiusToFahrenheit(temperature);
        } else if (mode.equals("F_TO_C")) {
        	result = TempConverter.fahrenheitToCelsius(temperature);
        } else {
        	System.out.println("Invalid Mode.");
            input.close();
            return;
        }
        System.out.println("Result: "+result);
}
}
