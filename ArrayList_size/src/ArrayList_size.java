import java.util.ArrayList;

public class ArrayList_size {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10); 
		myList.add(20);
		myList.add(30);
		
		
		//Printing the size of the ArrayList.
		System.out.println("size = " + myList.size());
		
	}
}