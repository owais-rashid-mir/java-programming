import java.util.Scanner;
public class ArrayInsertion {

	public static void main(String[] args) {
		
		int size, loc, item;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements: ");
		size = input.nextInt();
		
		int[] arr = new int[size+1];		
		System.out.println("enter array elements:");
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter the location for insertion :");
		loc = input.nextInt();
		
		System.out.println("enter the new element you want to insert:");
		item = input.nextInt();
		
		for(int i=(size-1) ; i>= (loc-1) ; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[loc-1] = item;
		
		for(int i=0 ; i<size ; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(arr[size]);
		
	}

}
