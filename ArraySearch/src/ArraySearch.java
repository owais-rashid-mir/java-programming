//Searching in an array - Linear search.

import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
		int size, i, item, loc=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no. of elements:");
		size=input.nextInt();
		
		int[] arr =new int[size];
		System.out.println("Enter the elements for the array :");
		for(i=0 ; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the element to be searched:");
		item= input.nextInt();
		
		for(i=0 ; i<size ; i++)
		{
			if(arr[i] == item)
			{
				loc = loc+1;
				break;
			}
		}
		
		if(loc>0)
			System.out.println("Element is present.");
		
		else
			System.out.println("Element is not present");
		

	}
}