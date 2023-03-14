import java.util.Scanner;

public class MethodPower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter base:");
		double base = input.nextDouble();
		
		System.out.println("Enter exponent:");
		double exp = input.nextDouble();
		
		double result = power(base,exp);
		System.out.println(base + " raised to the power "+ exp +" is: " + result);
	}
	
	public static double power(double base , double exp) {
		double res;
		res = Math.pow(base, exp);
		return res;
	}

}
