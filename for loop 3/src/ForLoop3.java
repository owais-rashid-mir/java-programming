import java.util.Scanner;

public class ForLoop3
{
	public static void main(String[] args)
	{
		double n;
		
		for(int i=0; i<2 ; i++)
		{
			Scanner input = new Scanner(System.in); /* You can also write this line outside
														the loop. */
			
			System.out.println("Enter a floating point no. :");
			n=input.nextDouble();
			
			System.out.println("You entered: " + n);
		}
		
	}
}
