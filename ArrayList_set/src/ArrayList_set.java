import java.util.ArrayList;

public class ArrayList_set {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10); 
		myList.add(20);
		myList.add(30);
		

		//updating an element.
				myList.set(2, 777); //where 2 is the index. 777 is the new element.
				for(Integer x:myList) {
					System.out.println(x);
				}
		
	}
}