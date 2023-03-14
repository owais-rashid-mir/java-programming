//Java program to find largest and smallest no. in an array:
import java.util.Scanner;
public class ArrayLargestSmallest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size, max, min;
		System.out.println("Enter no. of elements: ");
		size = input.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter no.s : ");
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		max = arr[0];
		min = arr[0];
		for(int i=0 ; i<size ; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println("Largest value: " + max);
		System.out.println("Smallest value: " + min);
	
	}

}
