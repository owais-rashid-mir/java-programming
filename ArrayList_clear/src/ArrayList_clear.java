import java.util.ArrayList;

public class ArrayList_clear {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10); 
		myList.add(20);
		myList.add(30);
		
		//Removing all the elements.
		myList.clear(); 
		for(Integer x:myList) {
			System.out.println(x);
		}
		
	}
}