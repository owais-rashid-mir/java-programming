//Printing 'n' natural numbers..

import java.util.Scanner;

public class ForLoop
{
	public static void main(String[] args)
	{
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of 'n' :");
		n = input.nextInt();
		System.out.println();  //for NEXT LINE. Similar to \n.hhhhhhhhhhhhhhhhhhhh
		
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(i);
		}
		
	}
}
