import java.util.ArrayList;

public class ArrayList_contains {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10); 
		myList.add(20);
		myList.add(30);
		

		/*checking whether element is present or not. if present, TRUE is displayed,
		 * otherwise FALSE.
		 */
		System.out.println(myList.contains(20));
		System.out.println(myList.contains(6785));
		
	}
}