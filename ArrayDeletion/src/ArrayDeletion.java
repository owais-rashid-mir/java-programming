import java.util.*;
public class ArrayDeletion {

	public static void main(String[] args) {
		
		int i, size, loc;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements: ");
		size = input.nextInt();
		
		int[] arr = new int[size];		
		System.out.println("enter array elements:");
		for(i=0 ; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the location for deletion :");
		loc = input.nextInt();
		
		for(i=loc ; i<size-1 ; i++)
		{
			arr[i] = arr[i+1];
		}
		size = size-1;
		
		System.out.println("After deleting, the new array is: ");
		for(i=0 ; i<size ; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
