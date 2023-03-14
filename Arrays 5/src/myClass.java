
import java.util.Scanner;
public class myClass
{
	public static void main(String[] args)
	{
		int[] arr;
		arr = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter elements for the array: ");
		for(int i=0 ; i<=4 ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		
		System.out.println("The entered elements are: ");
		for(int abc:arr)
		{
			System.out.println(abc);
		}
		
	}
}