//Reading user input into an ArrayList.
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_getting_user_input {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
		int size = input.nextInt();
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		System.out.println("Enter elements:");
		for(int i=0 ; i<size; i++) {
			int z = input.nextInt();
			myList.add(z);
		}
		
		System.out.println("Entered elements are:");
		for(int i=0 ; i<myList.size() ; i++) {
			System.out.println( myList.get(i) );
		}
		
		
	}

}
