//Sorting an array - Selection sort.

import java.util.Scanner;
public class ArraySort{
	public static void main(String[] args) {
		int size, i,j,temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no. of elements:");
		size=input.nextInt();
		
		int[] arr =new int[size];
		System.out.println("Enter the elements for the array :");
		for(i=0 ; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
	
		for(i=0 ; i<size ; i++)
		{
			for(j=i+1 ; j<size ; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("sorted array is :");
		for(i=0 ; i<size ; i++)
		{
			System.out.println(arr[i]);
		}
		

	}
}