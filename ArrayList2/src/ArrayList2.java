import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		
		/*at the last, in the () , we can also write an initial value. However, this
		 * value can increase or decrease according to the requirements.
		 * e.g - ArrayList<Integer> myList = new ArrayList<Integer>(5);
		 */
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Owais"); //'add' is  keyword for adding elements to ArrayList.
		myList.add("Rashid");
		myList.add("Mir");
		
		System.out.println(myList);

	}

}
