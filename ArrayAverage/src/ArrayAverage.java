import java.util.Scanner; 
public class ArrayAverage{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double avg,sum=0;
		
		int n; // keep it as int cuz arr is int also.otherwise there will be an error.
		
		System.out.println("enter no of elements:");
		n = input.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter nos:");
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = input.nextInt();
		}
		
		//calculating average:
		for(int i=0 ; i<n ; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("sum is " + sum);
		
		avg=sum/n;
		System.out.println("Average is: " + avg);
		
			
	}
}