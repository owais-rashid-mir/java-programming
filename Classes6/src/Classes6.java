//Addition of two numbers
import java.util.Scanner;
class Add{
	int a,b,c;
	
	void setData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=input.nextInt();
		b=input.nextInt();
	}
	
	void displayData() {
		c=a+b;
		System.out.println("Sum is: " + c );
	}
}


public class Classes6 {

	public static void main(String[] args) {
		
		Add a = new Add();
		a.setData();
		a.displayData();

	}

}
