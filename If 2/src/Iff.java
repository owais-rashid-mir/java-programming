import java.util.Scanner;
public class Iff 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :: ");
		num = input.nextInt();
		
		if(num>100)
		{
			System.out.println("Entered no. is greater than 100.");
		}
		
		
		else
		{
			System.out.println("The entered no. is less than 100.");
		}
	}
}
