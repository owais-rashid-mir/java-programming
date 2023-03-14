/* Note:  Unlike C/C++ , the default value of an array variable is zero, and not a garbage
 * value
 */


//Printing elements of an array- First way
public class Arrays
{
	public static void main(String[] args)
	{
		int[] arr;
		arr=new int[3];  //or, int[] arr = new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
}