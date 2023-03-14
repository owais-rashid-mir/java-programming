//Reversing an array

import java.util.Scanner;
public class ArrayReverse
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the elements for the array :");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println("The entered elements are:");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Elements in reverse order:");
		for(int i=arr.length-1 ; i>=0 ; i--)
		{
			System.out.println(arr[i]);
		}
		
		
	}//End of main
}//end of class