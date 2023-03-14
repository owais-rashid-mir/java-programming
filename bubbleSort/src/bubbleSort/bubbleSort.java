//Sorting an array - Bubble sort.
package bubbleSort;
import java.util.Scanner;
public class bubbleSort{
	public static void main(String[] args) {
		int size, i, j, temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no. of elements:");
		size=input.nextInt();
		
		int[] arr =new int[size];
		System.out.println("Enter the elements for the array :");
		for(i=0 ; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
	
		//Sorting
		for(i=0 ; i<(size-1) ; i++)
		{
			for(j=0 ; j<(size-1)-1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array is :");
		for(i=0 ; i<size ; i++)
		{
			System.out.println(arr[i]);
		}
		

	}
}