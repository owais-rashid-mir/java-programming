//Simple 2-D printing technique.

public class Mda {
	public static void main(String[] args) {
		
		int[][] arr = {
						{10,20},
						{40,50},
						{50,60}       //You can put comma here also..your choice
					  };
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
