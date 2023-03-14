//Converting a decimal number to its Binary equivalent
//using 'toStringBinary' method - in built method


import java.util.Scanner;

public class MethodDecToBin {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no.:");
		num = input.nextInt();
		
		String res = toBinary(num);
		System.out.println("Binary equ of " +num + " is " + res);
		
	}
	
	public static String toBinary(int num) {
		
		String res;
		res=Integer.toBinaryString(num);
		return res;
	}

}
