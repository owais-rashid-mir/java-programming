import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i,j,k,sum;
		
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] mat3 = new int[3][3];
		
		System.out.println("Enter elements for Matrix 1: ");
		for(i=0 ; i<mat1.length ; i++)
		{
			for(j=0 ; j<mat1[i].length ; j++)
			{
				mat1[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter elements for Matrix 2: ");
		for(i=0 ; i<mat2.length ; i++)
		{
			for(j=0 ; j<mat2[i].length ; j++)
			{
				mat2[i][j] = input.nextInt();
			}
		}
		
		System.out.println("The entered elements in Matrix 1 is: ");
		for(i=0 ; i<mat1.length ; i++)
		{
			for(j=0 ; j<mat1[i].length ; j++)
			{
				System.out.print(mat1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("The entered elements in Matrix 2 is: ");
		for(i=0 ; i<mat2.length ; i++)
		{
			for(j=0 ; j<mat2[i].length ; j++)
			{
				System.out.print(mat2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("The product of Matrix 1 and Matrix 2 = ");
		for(i=0 ; i<mat3.length ; i++)
		{
			for(j=0 ; j<mat3[i].length ; j++)
			{
				sum=0;
				for(k=0 ; k<3 ; k++)
					sum = sum + mat1[i][k] * mat2[k][j];
				mat3[i][j] = sum;
				
			}
		}
		
		System.out.println("The sum of Matrix 1 and Matrix 2 = ");
		for(i=0 ; i<mat3.length ; i++)
		{
			for(j=0 ; j<mat3[i].length ; j++)
			{
				System.out.print(mat3[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
