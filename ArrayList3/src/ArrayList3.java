//The correct way to display ArrayList items is to use an advanced 'for' loop.
import java.util.ArrayList;
public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		myList.add(10); //'add' is  keyword for adding elements to ArrayList.
		myList.add(20);
		myList.add(30);
		
		for(Integer x:myList) {
			System.out.println(x);
		}
		
		
	}

}
