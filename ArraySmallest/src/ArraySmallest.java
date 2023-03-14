//Java program to find smallest no. in an array:
import java.util.Scanner;
public class ArraySmallest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n, min;
		System.out.println("Enter no. of elements: ");
		n = input.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter no.s : ");
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		min = arr[0];
		for(int i=0 ; i<n ; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println("smallest value: " + min);
		
		
	
	}

}
