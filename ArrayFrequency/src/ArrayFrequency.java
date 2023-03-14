//Java program to check the frequency of a number in an array- How many times an element is
//present in the array.

import java.util.Scanner;
public class ArrayFrequency {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size, num, count=0;
		
		System.out.println("Enter the no. of elements:");
		size=input.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter elements:");
		for(int i=0; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter a no. to be searched: ");
		num=input.nextInt();
		
		for(int i=0; i<size ; i++)
		{
			if(num==arr[i])
			{
				count++;
			}
		}
		
		if(count==0)
			System.out.println("the entered element is not present.");
		
		else
			System.out.println("element is present and frequency is " + count);

	}

}
