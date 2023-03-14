//Java method that returns Absolute Value of a number:
import java.util.Scanner;

public class MethodAbsoluteValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no:");
		double num = input.nextDouble();
		
		double res = abs(num);
		System.out.println("Ab val: "+ res);
	}
	
	public static double abs(double num) {
		double res = Math.abs(num);
		return res;
	}

}
