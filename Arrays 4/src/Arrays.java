//Reading and displaying the elements of an array.

import java.util.Scanner;
public class Arrays
{
	public static void main(String[] args)
	{
		int[] arr;
		arr = new int[3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter elements for the array:");
		for(int i=0 ; i<3 ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		
		System.out.println("The entered elements are:");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}