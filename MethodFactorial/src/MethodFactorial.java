//Java method which returns factorial of a number

import java.util.Scanner;

public class MethodFactorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no whose fact is to b found:");
		int num = input.nextInt();
		
		int result = fact(num);
		System.out.println("Fact of " + num +" is " +result);
	}
	
	public static int fact(int num) {
		int f=1;
		for(int i=1; i<=num ; i++) {
			f = f*i;
		}
		return f;
	}

}
