import java.util.Scanner;

public class myClass
{
	public static void main(String[] args)
	{
		int[][] arr = new int[2][4];
		
		Scanner input = new Scanner(System.in);
		
		//Reading
		System.out.println("Enter elements: ");
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				arr[i][j] = input.nextInt();
			}
		}
		
		//Displaying
		System.out.println("The entered elements are: ");
		for(int i=0 ; i<2 ; i++)
		{
			for(int j=0 ; j<4 ; j++)
			{
				System.out.print( arr[i][j] + "\t" );
			}
			System.out.println();
		}
		
		
		
	}
}