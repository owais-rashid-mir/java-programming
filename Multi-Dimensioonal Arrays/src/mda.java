
public class mda 
{
	public static void main(String[] args) 
	{
		int arr1[][] = {
				{1,2,3},
				{4,5,6}
						};
		
		System.out.println( arr1[0][0] ); //Refers to 1
		System.out.println( arr1[0][1] ); //refers to 2
		System.out.println( arr1[1][1] ); //refers to 5
		System.out.println( arr1[1][2] ); //refers to 6
		
		/*Unlike C/C++, We can initialize an 2-D array like this:(Applicable only when array is declared 
			and initialized in one line.
		*/
		System.out.println();
		int arr2[][] = {
				{10,20,30},
				{40,50},
				{60}
						};
		
		System.out.println( arr2[0][1] ); //refers to 20
		System.out.println( arr2[1][0] ); //refers to 40
		System.out.println( arr2[2][0] ); //refers to 60
		
		
		
	}
}
