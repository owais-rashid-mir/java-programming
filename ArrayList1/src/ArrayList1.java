import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		
		/*at the last, in the () , we can also write an initial value. However, this
		 * value can increase or decrease according to the requirements.
		 * e.g - ArrayList<Integer> myList = new ArrayList<Integer>(5);
		 */
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1); //'add' is  keyword for adding elements to ArrayList.
		myList.add(2);
		myList.add(3);
		
		System.out.println(myList);

	}

}
