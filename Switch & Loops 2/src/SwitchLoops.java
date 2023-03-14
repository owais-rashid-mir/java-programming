import java.util.Scanner;

public class SwitchLoops
{
	public static void main(String[] args)
	{
		int choice,num1,num2,ch=1;
		
		while(ch!=0)
		{
			Scanner input = new Scanner(System.in);
		
			System.out.println();
			System.out.println("Enter your choice:");
			System.out.println("Press 1 for Addition.\nPress 2 for Subtraction.\nPress 3 to exit.");
			choice=input.nextInt();
		
			switch(choice)
			{
				case 1:
					System.out.println("Enter a number:");
					num1=input.nextInt();
					
					System.out.println("Enter another number:");
					num2=input.nextInt();
					
					System.out.println("Sum = " + (num1+num2) );
					
					break;
				
				case 2:
					System.out.println("Enter a number:");
					num1=input.nextInt();
					
					System.out.println("Enter another number:");
					num2=input.nextInt();
					
					System.out.println("Difference = " + (num1-num2) );
					
					break;
					
				case 3:
					System.out.println("Press 0 to exit");
					ch = input.nextInt();
				
			}//End of Switch
			
		}//end of while
		
	}//End of main
	
}//end of class