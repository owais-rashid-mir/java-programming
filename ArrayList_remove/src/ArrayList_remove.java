import java.util.ArrayList;

public class ArrayList_remove {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10); 
		myList.add(20);
		myList.add(30);
		
		//Removing an element.
				myList.remove(2); //where 2 is the index. Here,element 30 will be removed.
				for(Integer x:myList) {
					System.out.println(x);
				}
		
	}
}