import java.util.Scanner;

public class GUI
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENter a no. :");
		a=input.nextInt();
		
		System.out.println("Enter another no. :");
		b=input.nextInt();
		
		c=a+b;
		System.out.println("Sum = " + c);
	}
}
