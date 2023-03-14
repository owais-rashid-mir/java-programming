import java.util.Scanner;

public class MethodIsPrime {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a no:");
		int num = input.nextInt();
		
		boolean result = isPrime(num);
		System.out.println(result);
	}
	
	public static boolean isPrime(int num)  {
		for(int i=2 ; i<num ; i++) {
			if(num%i==0) {
				return false;
			} //if
			
		} //loop
		return true;
	}

}
