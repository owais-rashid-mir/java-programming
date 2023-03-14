//Java program to find largest no. in an array:
import java.util.Scanner;
public class ArrayMax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n, max;
		System.out.println("Enter no. of elements: ");
		n = input.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter no.s : ");
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		max = arr[0];
		for(int i=0 ; i<n ; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("Largest value: " + max);
		
	}

}
