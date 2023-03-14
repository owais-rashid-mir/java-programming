

public class MethodReplace {
	public static void main(String[] args) {
		String text = "Hello";
		
		System.out.println(replace(text));
		
	}

	public static String replace(String text) {
		String result = text.replace('l', 'b');
		return result;
	}
}
