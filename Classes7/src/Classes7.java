//Addition of two numbers

class Add{
	int a,b,c;
	
	void setData(int x , int y) {
		a=x;
		b=y;
		
	}
	
	void displayData() {
		c=a+b;
		System.out.println("Sum is: " + c );
	}
}


public class Classes7 {

	public static void main(String[] args) {
		
		Add a = new Add();
		a.setData(3,4);
		a.displayData();

	}

}
