//Check the case 3 of this program..
//wait, this issue is fixed. Check the 'Switch & Loops 2' program.

import java.util.Scanner;

public class SwitchNloop {

	public static void main(String[] args) {
		
		int choice,num1,num2,sum,ch=1;
		
		while(ch != 0)
		{
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter your choice: ");
			System.out.println("Press 1 for Addition.\nPress 2 for Subtraction.");
			System.out.println("Press 3 to exit. \n ");
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
					
				case 3:
					System.out.println("Press 0 to exit.");
					ch=input.nextInt();
					
				default:
					System.out.println("Invalid Choice.");
			} //End of switch
		}//End of while

	}//end of main

}//ENd of class
