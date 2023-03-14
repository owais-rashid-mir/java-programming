import java.util.Scanner;
public class Switch_2
{
	public static void main(String[] args)
	{
		int choice,num1,num2,sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		System.out.println("Press 1 for Addition.\nPress 2 for Subtraction. \n");
		choice = input.nextInt();
		
		System.out.println("Enter a number: ");
		num1=input.nextInt();
		
		System.out.println("Enter another number: ");
		num2=input.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Sum = " + (num1+num2) ) ;
				break;
				
			case 2:
				System.out.println("Difference = " + (num1-num2) );
				break;
				
			default:
				System.out.println("Invalid Choice.");
		}
	}
}
