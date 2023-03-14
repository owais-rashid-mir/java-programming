import java.util.Scanner;

public class MethodToUpper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String text= input.nextLine();
		
		System.out.println(toUpper(text));
		
	}

	public static String toUpper(String text) {
		String result = text.toUpperCase();
		return result;
	}
}
