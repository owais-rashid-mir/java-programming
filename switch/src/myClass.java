import java.util.Scanner;
public class myClass
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the command: ");
		String text = input.nextLine();
		
		switch(text)
		{
			case "start":
				System.out.println("Machine started.");
				break;
				
			case "stop":
				System.out.println("Machine stopped.");
				break;
				
				
			default:
				System.out.println("Invalid Command.");
			
		} //End of Switch
		
		
	}//End of main
}//End of class
