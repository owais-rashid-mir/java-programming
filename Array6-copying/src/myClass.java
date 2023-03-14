//Copying the elements of one array into another.

import java.util.Scanner;
public class myClass
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the elements for the array(arr1) :");
		for(int i=0 ; i<arr1.length ; i++)
		{
			arr1[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println("The entered elements in arr1 are:");
		for(int temp:arr1)
		{
			System.out.println(temp);
		}
		
		//Copying
		for(int i=0 ; i<arr1.length ; i++)
		{
			arr2[i] = arr1[i];
		}
		
		System.out.println();
		System.out.println("The copied elements in arr2 are: ");
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.println(arr2[i]);
		}
		
		
		
	}//End of main
}//end of class