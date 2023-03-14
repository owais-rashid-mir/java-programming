import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_sort {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(30); 
		myList.add(10);
		myList.add(20);
		

		/*sorting - we've a sort method in the 'Collections' class. For using it,import the 
		header file - import java.util.Collections; */
		Collections.sort(myList);
		for(Integer x:myList) {
			System.out.println(x);
		}	
		
		
	}
}