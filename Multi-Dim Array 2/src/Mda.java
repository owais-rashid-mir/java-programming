
public class Mda 
{
	public static void main(String[] args)
	{
		int[][] a;
		a = new int[2][3]; //or, int[][] a= new int[2][3];
		
		System.out.println( a[0][0] ); //it is not initialized, therefore will print 0.
		
		a[1][1] = 10;
		System.out.println( a[1][1] ); 
		
		System.out.println();

//------------------------------------------------------------------------
		String[][] arr = new String[2][3];
		
		System.out.println( arr[0][0] ); //it is not initialized, therefore will print NULL
		
		arr[0][1] = "Owais";
		System.out.println( arr[0][1] );
	}
}
