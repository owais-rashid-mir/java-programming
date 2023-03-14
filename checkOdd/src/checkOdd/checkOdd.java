package checkOdd;

import java.util.Scanner;

public class checkOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = input.nextInt();
		
		System.out.println(evenOdd(n));
		
	}
	
	public static boolean evenOdd(int n) {
		int r = n%2;
		if(r==0) {
			//System.out.println("Evven");
			return false;
		}
		
		else {
			//System.out.println("odd");
			return true;
		}
	}

}
