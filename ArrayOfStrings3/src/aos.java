import java.util.Scanner;
public class aos
{
	public static void main(String[] args)
	{
		String[] words = new String[3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter words for this array: ");
		for(int i=0 ; i<words.length ; i++)
		{
			words[i] = input.nextLine();
		}
		
		System.out.println("The entered words are:");
		for(String abc : words)
		{
			System.out.println(abc);
		}
	}
}


